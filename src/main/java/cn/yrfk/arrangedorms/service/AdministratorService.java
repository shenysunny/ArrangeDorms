package cn.yrfk.arrangedorms.service;

import cn.yrfk.arrangedorms.mapper.AdministratorEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdministratorService 服务层
 */
@Service
public class AdministratorService {
    @Autowired
    AdministratorEntityMapper administratorEntityMapper;
}
