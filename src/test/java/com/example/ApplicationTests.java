package com.example;

import org.cassandraunit.spring.CassandraDataSet;
import org.cassandraunit.spring.CassandraUnit;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringRunner.class)
@SpringBootTest({"spring.data.cassandra.port=9142",
    "spring.data.cassandra.keyspace-name=keyspaceToCreate"})
@TestExecutionListeners({OrderedCassandraTestExecutionListener.class, DependencyInjectionTestExecutionListener.class})
@CassandraDataSet(value = {"setupTables.cql"}, keyspace = "keyspaceToCreate")
@CassandraUnit
public abstract class ApplicationTests {
    
}
