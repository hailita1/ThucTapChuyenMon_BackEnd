package com.example.demo.repository;

import com.example.demo.model.Host;
import com.example.demo.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
    Iterable<House> findAllByTrangThai(String trangThai);

    Iterable<House> findAllByHost(Host host);

    //Tìm kiếm 1 tiêu chí

    Iterable<House> findAllByDiaChiContainsAndTrangThaiOrSoLuongPhongNguOrSoLuongPhongTamOrGiaTienTheoDemBetween(String diaChi, String trangThai, int slpn, int slpt, Double dauDuoi, Double dauTren);

    Iterable<House> findAllBySoLuongPhongNguAndTrangThaiOrDiaChiContainsOrSoLuongPhongTamOrGiaTienTheoDemBetween(int slpn, String trangThai, String diaChi, int slpt, Double dauDuoi, Double dauTren);

    Iterable<House> findAllBySoLuongPhongTamAndTrangThaiOrDiaChiContainsOrSoLuongPhongNguOrGiaTienTheoDemBetween(int slpt, String trangThai, String diaChi, int slpn, Double dauDuoi, Double dauTren);

    Iterable<House> findAllByGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongNguOrSoLuongPhongTam(Double dauDuoi, Double dauTren, String trangThai, String diaChi, int slpn, int slpt);

    //Tìm kiếm theo 2 tiêu chí

    Iterable<House> findAllByDiaChiContainsAndSoLuongPhongTamAndTrangThaiOrSoLuongPhongNguOrGiaTienTheoDemBetween(String diaChi, int slpt, String trangThai, int slpn, Double dauDuoi, Double dauTren);

    Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndTrangThaiOrSoLuongPhongNguOrGiaTienTheoDemBetween(String diaChi, int slpn, String trangThai, int slpt, Double dauDuoi, Double dauTren);

    Iterable<House> findAllByDiaChiContainsAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongNguOrSoLuongPhongTam(String diaChi, Double dauDuoi, Double dauTren, String trangThai, int slpn, int slpt);

    Iterable<House> findAllBySoLuongPhongTamAndSoLuongPhongNguAndTrangThaiOrDiaChiContainsOrGiaTienTheoDemBetween(int slpt, int slpn, String trangThai, String diaChi, Double dauDuoi, Double dauTren);

    Iterable<House> findAllBySoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongNgu(int slpt, Double dauDuoi, Double dauTren, String trangThai, String diaChi, int slpn);

    Iterable<House> findAllBySoLuongPhongNguAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContainsOrSoLuongPhongTam(int slpn, Double dauDuoi, Double dauTren, String trangThai, String diaChi, int slpt);

    //Tìm kiếm theo 3 tiêu chí
    Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndSoLuongPhongTamAndTrangThaiOrGiaTienTheoDemBetween(String diaChi, int slpn, int slpt, String trangThai, Double dauDuoi, Double dauTren);

    Iterable<House> findAllByDiaChiContainsAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongNgu(String diaChi, int slpt, Double dauDuoi, Double dauTren, String trangThai, int slpn);

    Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndGiaTienTheoDemBetweenAndTrangThaiOrSoLuongPhongTam(String diaChi, int slpn, Double dauDuoi, Double dauTren, String trangThai, int slpt);

    Iterable<House> findAllBySoLuongPhongNguAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThaiOrDiaChiContains(int slpn, int slpt, Double dauDuoi, Double dauTren, String trangThai, String diaChi);

    //Tìm kiếm theo cả 4 tiêu chí
    Iterable<House> findAllByDiaChiContainsAndSoLuongPhongNguAndSoLuongPhongTamAndGiaTienTheoDemBetweenAndTrangThai(String diaChi, int slpn, int slpt, Double dauDuoi, Double dauTren, String trangThai);

}