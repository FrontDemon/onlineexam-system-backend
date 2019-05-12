package com.mwt.oes.service;

import java.util.List;
import java.util.Map;

public interface StudentSearchService {
    public List<Map<String, Object>> getSearchPapers(String keyword);
}
