package org.is7000.market.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.testcontainers.containers.JdbcDatabaseContainer;

public interface SqlTestContainer extends InitializingBean, DisposableBean {
    JdbcDatabaseContainer<?> getTestContainer();
}