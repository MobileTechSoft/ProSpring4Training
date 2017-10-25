package com.apress.prospring4.ch6.extractor;

import java.util.List;

public interface ContactDao {
    String findLastNameById(Long id);
    List<Contact> findAllWithDetail();
}
