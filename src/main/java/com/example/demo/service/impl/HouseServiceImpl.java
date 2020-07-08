package com.example.demo.service.impl;

import com.example.demo.model.Host;
import com.example.demo.model.House;
import com.example.demo.repository.HouseRepository;
import com.example.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseRepository houseRepository;

    @Override
    public Iterable<House> findAll() {
        return this.houseRepository.findAll();
    }

    @Override
    public House findById(Long id) {
        return this.houseRepository.findById(id).get();
    }

    @Override
    public void save(House house) {
        this.houseRepository.save(house);
    }

    @Override
    public void remove(Long id) {
        this.houseRepository.deleteById(id);
    }

    @Override
    public Iterable<House> findAllByTrangThai(String trangThai) {
        return houseRepository.findAllByTrangThai(trangThai);
    }

    @Override
    public Iterable<House> findAllByHost(Host host) {
        return houseRepository.findAllByHost(host);
    }

    //Tìm kiếm theo 1 tiêu chí
    @Override
    public Iterable<House> findAllByDiaChiContainsAndTrangThaiOrSoLuongPhongNguOrSoLuongPhongTamOrGiaTienTheoDemBetween(String diaChi, String trangThai, int slpn, int slpt, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllByDiaChiContainsAndTrangThaiOrSoLuongPhongNguOrSoLuongPhongTamOrGiaTienTheoDemBetween(diaChi, trangThai, slpn, slpt, dauDuoi, dauTren);
    }

    @Override
    public Iterable<House> findAllBySoLuongPhongNguAndTrangThaiOrDiaChiContainsOrSoLuongPhongTamOrGiaTienTheoDemBetween(int slpn, String trangThai, String diaChi, int slpt, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllBySoLuongPhongNguAndTrangThaiOrDiaChiContainsOrSoLuongPhongTamOrGiaTienTheoDemBetween(slpn, trangThai, diaChi, slpt, dauDuoi, dauTren);
    }

    @Override
    public Iterable<House> findAllBySoLuongPhongTamAndTrangThaiOrDiaChiContainsOrSoLuongPhongNguOrGiaTienTheoDemBetween(int slpt, String trangThai, String diaChi, int slpn, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllBySoLuongPhongTamAndTrangThaiOrDiaChiContainsOrSoLuongPhongNguOrGiaTienTheoDemBetween(slpt, trangThai, diaChi, slpn, dauDuoi, dauTren);
    }


    @Override
    public Iterable<House> findAllByGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongNguOrSoLuongPhongTam(Double dauDuoi, Double dauTren, String trangThai, String diaChi, int slpn, int slpt) {
        return houseRepository.findAllByGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongNguOrSoLuongPhongTam(dauDuoi, dauTren, trangThai, diaChi, slpn, slpt);
    }

    //Tìm kiếm theo 2 tiêu chí
    @Override
    public Iterable<House> findAllByDiaChiContainsAndSoLuongPhongTamAndTrangThaiOrSoLuongPhongNguOrGiaTienTheoDemBetween(String diaChi, int slpt, String trangThai, int slpn, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllByDiaChiContainsAndSoLuongPhongTamAndTrangThaiOrSoLuongPhongNguOrGiaTienTheoDemBetween(diaChi, slpt, trangThai, slpn, dauDuoi, dauTren);
    }

    @Override
    public Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndTrangThaiOrSoLuongPhongNguOrGiaTienTheoDemBetween(String diaChi, int slpn, String trangThai, int slpt, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllByDiaChiContainsAndSoLuongPhongNguAndTrangThaiOrSoLuongPhongNguOrGiaTienTheoDemBetween(diaChi, slpn, trangThai, slpt, dauDuoi, dauTren);
    }

    @Override
    public Iterable<House> findAllByDiaChiContainsAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongNguOrSoLuongPhongTam(String diaChi, Double dauDuoi, Double dauTren, String trangThai, int slpn, int slpt) {
        return houseRepository.findAllByDiaChiContainsAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongNguOrSoLuongPhongTam(diaChi, dauDuoi, dauTren, trangThai, slpn, slpt);
    }

    @Override
    public Iterable<House> findAllBySoLuongPhongTamAndSoLuongPhongNguAndTrangThaiOrDiaChiContainsOrGiaTienTheoDemBetween(int slpt, int slpn, String trangThai, String diaChi, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllBySoLuongPhongTamAndSoLuongPhongNguAndTrangThaiOrDiaChiContainsOrGiaTienTheoDemBetween(slpt, slpn, trangThai, diaChi, dauDuoi, dauTren);
    }

    @Override
    public Iterable<House> findAllBySoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongNgu(int slpt, Double dauDuoi, Double dauTren, String trangThai, String diaChi, int slpn) {
        return houseRepository.findAllBySoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongNgu(slpt, dauDuoi, dauTren, trangThai, diaChi, slpn);
    }

    @Override
    public Iterable<House> findAllBySoLuongPhongNguAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongTam(int slpn, Double dauDuoi, Double dauTren, String trangThai, String diaChi, int slpt) {
        return houseRepository.findAllBySoLuongPhongNguAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongTam(slpn, dauDuoi, dauTren, trangThai, diaChi, slpt);
    }

    @Override
    public Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndSoLuongPhongTamAndTrangThaiOrGiaTienTheoDemBetween(String diaChi, int slpn, int slpt, String trangThai, Double dauDuoi, Double dauTren) {
        return houseRepository.findAllByDiaChiContainsAndSoLuongPhongNguAndSoLuongPhongTamAndTrangThaiOrGiaTienTheoDemBetween(diaChi, slpn, slpt, trangThai, dauDuoi, dauTren);
    }

    @Override
    public Iterable<House> findAllByDiaChiContainsAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongNgu(String diaChi, int slpt, Double dauDuoi, Double dauTren, String trangThai, int slpn) {
        return houseRepository.findAllByDiaChiContainsAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongNgu(diaChi, slpt, dauDuoi, dauTren, trangThai, slpn);
    }

    @Override
    public Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongTam(String diaChi, int slpn, Double dauDuoi, Double dauTren, String trangThai, int slpt) {
        return houseRepository.findAllByDiaChiContainsAndSoLuongPhongNguAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongTam(diaChi, slpn, dauDuoi, dauTren, trangThai, slpt);
    }

    @Override
    public Iterable<House> findAllBySoLuongPhongNguAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContains(int slpn, int slpt, Double dauDuoi, Double dauTren, String trangThai, String diaChi) {
        return houseRepository.findAllBySoLuongPhongNguAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContains(slpn, slpt, dauDuoi, dauTren, trangThai, diaChi);
    }

    @Override
    public Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThai(String diaChi, int slpn, int slpt, Double dauDuoi, Double dauTren, String trangThai) {
        return houseRepository.findAllByDiaChiContainsAndSoLuongPhongNguAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThai(diaChi, slpn, slpt, dauDuoi, dauTren, trangThai);
    }
}
