/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.qa.specs;

import com.stratio.qa.utils.ThreadProperty;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CCTTest {

    @Test
    public void testCheckStatusNumberOfTasKHealty() throws Exception {
        ThreadProperty.set("class", this.getClass().getCanonicalName());
        CommonG commong = new CommonG();
        CCTSpec cct = new CCTSpec(commong);
        String response = "{\"id\":\"/s000001/s000001-postgrestls\",\"tenant\":\"s000001\",\"service\":\"postgres\",\"model\":\"default\",\"version\":\"0.7.0\",\"release\":\"0.7\",\"serviceLabel\":\"s000001-postgrestls.s000001\",\"resources\":{\"disk\":36864.0,\"mem\":5120.0,\"gpus\":0.0,\"cpus\":6.0},\"status\":\"RUNNING\",\"healthiness\":\"HEALTHY\",\"tasks\":[{\"id\":\"s000001_s000001-postgrestls.3a0834d5-6d57-11ea-94e2-dec4ac2bea30\",\"name\":\"s000001-postgrestls.s000001\",\"status\":\"RUNNING\",\"healthiness\":\"HEALTHY\",\"timestamp\":1585003230000,\"resources\":{\"disk\":0.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.26\",\"securedHost\":\"172.16.104.129\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"c6914a17-c63f-4da3-89e4-0ecfcdec4dd5\",\"name\":\"pg-agent\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003330000,\"resources\":{\"disk\":0.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":2.0},\"host\":\"10.200.15.23\",\"securedHost\":\"172.16.163.138\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"d516887b-36b1-476f-b068-20d2ca904407\",\"name\":\"pg-0003\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003296000,\"resources\":{\"disk\":12288.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.25\",\"securedHost\":\"172.16.114.202\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"b9135a11-ee80-4e3e-8b6c-f06ca7442dc1\",\"name\":\"pg-0002\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003262000,\"resources\":{\"disk\":12288.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.24\",\"securedHost\":\"172.16.58.200\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"46fee8bb-db18-453b-b9e7-9a9ebb67514f\",\"name\":\"pg-0001\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003249000,\"resources\":{\"disk\":12288.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.23\",\"securedHost\":\"172.16.163.137\",\"frameworkId\":\"s000001-postgrestls.s000001\"}],\"exposition\":{\"pattern\":\"pg-0001\",\"port\":\"5432\",\"tags\":[]},\"instances\":1,\"totalTasks\":5,\"totalHealthyTasks\":5,\"networks\":[{\"name\":\"s000001-core\",\"mode\":\"container\",\"labels\":{}}],\"external\":[{\"type\":\"admin\",\"url\":\"https://bootstrap.nightlyforward.labs.stratio.com/service/s000001-postgrestls.s000001\"}],\"env\":{\"POSTGRES_WAL_ARCHIVER_PATH\":\"/tmp\",\"POSTGRES_WAL_ARCHIVER\":\"false\",\"APPNAME\":\"postgrestls\",\"FRAMEWORK_DOCKER_IMAGE\":\"daedalus-qa.labs.stratio.com:5007/stratio/postgresql-community:1.9.1\",\"AGENT_OWNER_REPARENT_WHITELIST\":\"\",\"POSTGRES_GOSEC_SECURITY\":\"true\",\"FRAMEWORK_AVAILABILITY_ZONES_LABEL\":\"dc\",\"FRAMEWORK_DOCKER_RETRY_DELAY_SECONDS\":\"5\",\"FRAMEWORK_AVAILABILITY_ZONES_NUMBER\":\"2\",\"FRAMEWORK_MESOS_ROLE\":\"s000001-postgrestls.s000001\",\"POSTGRES_SECURITY_TYPE\":\"TLS\",\"POSTGRES_ENABLE_HIGH_AVAILABILITY\":\"true\",\"AGENT_OWNER_TO_REPARENT\":\"\",\"FRAMEWORK_ENABLE_AVAILABILITY_ZONES\":\"false\",\"POSTGRES_INDEX_DISK\":\"4096\",\"POSTGRES_WAL_DISK\":\"4096\",\"POSTGRES_RESTORE_SNAPSHOT_LABEL\":\"\",\"POSTGRES_GOSEC_URL_AUTH\":\"bootstrap.nightlyforward.labs.stratio.com\",\"POSTGRES_ASYNC_SLAVE_NODE_PLACEMENT\":\"\",\"FRAMEWORK_ENABLE_MARATHON_SEC\":\"true\",\"FRAMEWORK_ISOLATION_NETWORK_NAME\":\"s000001-core\",\"POSTGRES_GOSEC_ALLOW_IN_PERM_CONFLICT\":\"false\",\"POSTGRES_GOSEC_VERSION\":\"1.4.1\",\"POSTGRES_WAL_ARCHIVER_TYPE\":\"hdfs\",\"FRAMEWORK_DOCKER_LAUNCH_RETRIES\":\"5\",\"FRAMEWORK_ENABLE_MESOS_SEC\":\"true\",\"FRAMEWORK_DOCKER_IMAGE_FORCE_PULL\":\"true\",\"POSTGRES_GOSEC_ALLOW_ORPHAN_RESOURCES\":\"true\",\"POSTGRES_WAL_DISK_TYPE\":\"ROOT\",\"FRAMEWORK_ENABLE_AUTOMATIC_FAILOVER\":\"true\",\"FRAMEWORK_DNS_DOMAIN\":\"mesos\",\"POSTGRES_CPU\":\"1\",\"REALM\":\"NIGHTLYFORWARD.LABS.STRATIO.COM\",\"FRAMEWORK_AVAILABILITY_ZONES_PATTERN\":\"dc(1|2)\",\"POSTGRES_GOSEC_DISABLE_COLUMN_PERMISSIONS\":\"false\",\"FRAMEWORK_ENABLE_API_SECURITY\":\"false\",\"POSTGRES_GOSEC_DOCKER_IMAGE\":\"daedalus-qa.labs.stratio.com:5007/stratio/postgres-agent:1.8.0\",\"POSTGRES_RESTORE_PATH\":\"/tmp/s000001-postgrestls.s000001\",\"POSTGRES_RESTORE_MODE\":\"false\",\"POSTGRES_RESTORE_HDFS_CONFIG_URL\":\"\",\"POSTGRES_AGENT_NODE_PLACEMENT\":\"\",\"FRAMEWORK_INITIAL_INTERNAL_CONFIG\":\"\",\"POSTGRES_LOG_LEVEL\":\"INFO\",\"VAULT_ROLE\":\"s000001\",\"POSTGRES_INDEX_DISK_TYPE\":\"ROOT\",\"POSTGRES_SYNC_SLAVE_NODE_PLACEMENT\":\"\",\"POSTGRES_GOSEC_REVOKE_PUBLIC\":\"false\",\"API_AUTHORIZED_CN\":\"deploy-api\",\"FRAMEWORK_ZOOKEEPER\":\"master.mesos:2181\",\"POSTGRES_GOSEC_LOG_LEVEL\":\"INFO\",\"KADMIN_HOST\":\"kerberos.nightlyforward.labs.stratio.com:749\",\"FRAMEWORK_MESOS_MASTER\":\"master.mesos:2181\",\"FRAMEWORK_LOG_LEVEL\":\"INFO\",\"KDC_UDP_ENABLED\":\"true\",\"FRAMEWORK_ETCD_ENDPOINTS\":\"https://etcd-client.service.eos.nightlyforward.labs.stratio.com:2379\",\"FRAMEWORK_DNS_TYPE\":\"mesos\",\"AGENT_ENABLE_OWNER_REPARENTING\":\"false\",\"KDC_HOST\":\"kerberos.nightlyforward.labs.stratio.com:88\",\"POSTGRES_DATA_DISK_TYPE\":\"ROOT\",\"POSTGRES_GOSEC_SERVICES_URL\":\"gosec-services-daas.marathon.mesos:8443\",\"VAULT_PORT\":\"8200\",\"POSTGRES_VERSION\":\"12\",\"APPROLE\":{\"secret\":\"role\"},\"VAULT_HOSTS\":\"vault.service.eos.nightlyforward.labs.stratio.com\",\"POSTGRES_GOSEC_DOCKER_IMAGE_FORCE_PULL\":\"true\",\"POSTGRES_MEMORY\":\"1024\",\"POSTGRES_MASTER_NODE_PLACEMENT\":\"\",\"POSTGRES_RESTORE_TARGET_TIME\":\"latest\",\"POSTGRES_DATA_DISK\":\"4096\",\"POSTGRES_RESTORE_TYPE\":\"hdfs\",\"POSTGRES_WAL_ARCHIVER_HDFS_CONFIG_URL\":\"\",\"POSTGRES_GOSEC_IDENTITIES_URL\":\"gosec-identities-daas.marathon.mesos:8443\",\"POSTGRES_GOSEC_REFRESH_PERIOD\":\"15\",\"FRAMEWORK_LOST_STATE_TIMEOUT_SECONDS\":\"60\"}}";
        assertThat(cct.checkServiceStatusInResponse("RUNNING", response, 3 , "pg-[\\d]*")).as("Not as expected").isEqualTo(true);
    }

    @Test
    public void testCheckStatusNumberOfTaskOneUnHealthy() throws Exception {
        ThreadProperty.set("class", this.getClass().getCanonicalName());
        CommonG commong = new CommonG();
        CCTSpec cct = new CCTSpec(commong);
        String response = "{\"id\":\"/s000001/s000001-postgrestls\",\"tenant\":\"s000001\",\"service\":\"postgres\",\"model\":\"default\",\"version\":\"0.7.0\",\"release\":\"0.7\",\"serviceLabel\":\"s000001-postgrestls.s000001\",\"resources\":{\"disk\":36864.0,\"mem\":5120.0,\"gpus\":0.0,\"cpus\":6.0},\"status\":\"RUNNING\",\"healthiness\":\"UNHEALTHY\",\"tasks\":[{\"id\":\"s000001_s000001-postgrestls.3a0834d5-6d57-11ea-94e2-dec4ac2bea30\",\"name\":\"s000001-postgrestls.s000001\",\"status\":\"RUNNING\",\"healthiness\":\"HEALTHY\",\"timestamp\":1585003230000,\"resources\":{\"disk\":0.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.26\",\"securedHost\":\"172.16.104.129\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"c6914a17-c63f-4da3-89e4-0ecfcdec4dd5\",\"name\":\"pg-agent\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003330000,\"resources\":{\"disk\":0.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":2.0},\"host\":\"10.200.15.23\",\"securedHost\":\"172.16.163.138\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"d516887b-36b1-476f-b068-20d2ca904407\",\"name\":\"pg-0003\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003296000,\"resources\":{\"disk\":12288.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.25\",\"securedHost\":\"172.16.114.202\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"b9135a11-ee80-4e3e-8b6c-f06ca7442dc1\",\"name\":\"pg-0002\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003262000,\"resources\":{\"disk\":12288.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.24\",\"securedHost\":\"172.16.58.200\",\"frameworkId\":\"s000001-postgrestls.s000001\"},{\"id\":\"46fee8bb-db18-453b-b9e7-9a9ebb67514f\",\"name\":\"pg-0001\",\"status\":\"RUNNING\",\"healthiness\":\"UNKNOWN\",\"timestamp\":1585003249000,\"resources\":{\"disk\":12288.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.23\",\"securedHost\":\"172.16.163.137\",\"frameworkId\":\"s000001-postgrestls.s000001\"}],\"exposition\":{\"pattern\":\"pg-0001\",\"port\":\"5432\",\"tags\":[]},\"instances\":1,\"totalTasks\":5,\"totalHealthyTasks\":5,\"networks\":[{\"name\":\"s000001-core\",\"mode\":\"container\",\"labels\":{}}],\"external\":[{\"type\":\"admin\",\"url\":\"https://bootstrap.nightlyforward.labs.stratio.com/service/s000001-postgrestls.s000001\"}],\"env\":{\"POSTGRES_WAL_ARCHIVER_PATH\":\"/tmp\",\"POSTGRES_WAL_ARCHIVER\":\"false\",\"APPNAME\":\"postgrestls\",\"FRAMEWORK_DOCKER_IMAGE\":\"daedalus-qa.labs.stratio.com:5007/stratio/postgresql-community:1.9.1\",\"AGENT_OWNER_REPARENT_WHITELIST\":\"\",\"POSTGRES_GOSEC_SECURITY\":\"true\",\"FRAMEWORK_AVAILABILITY_ZONES_LABEL\":\"dc\",\"FRAMEWORK_DOCKER_RETRY_DELAY_SECONDS\":\"5\",\"FRAMEWORK_AVAILABILITY_ZONES_NUMBER\":\"2\",\"FRAMEWORK_MESOS_ROLE\":\"s000001-postgrestls.s000001\",\"POSTGRES_SECURITY_TYPE\":\"TLS\",\"POSTGRES_ENABLE_HIGH_AVAILABILITY\":\"true\",\"AGENT_OWNER_TO_REPARENT\":\"\",\"FRAMEWORK_ENABLE_AVAILABILITY_ZONES\":\"false\",\"POSTGRES_INDEX_DISK\":\"4096\",\"POSTGRES_WAL_DISK\":\"4096\",\"POSTGRES_RESTORE_SNAPSHOT_LABEL\":\"\",\"POSTGRES_GOSEC_URL_AUTH\":\"bootstrap.nightlyforward.labs.stratio.com\",\"POSTGRES_ASYNC_SLAVE_NODE_PLACEMENT\":\"\",\"FRAMEWORK_ENABLE_MARATHON_SEC\":\"true\",\"FRAMEWORK_ISOLATION_NETWORK_NAME\":\"s000001-core\",\"POSTGRES_GOSEC_ALLOW_IN_PERM_CONFLICT\":\"false\",\"POSTGRES_GOSEC_VERSION\":\"1.4.1\",\"POSTGRES_WAL_ARCHIVER_TYPE\":\"hdfs\",\"FRAMEWORK_DOCKER_LAUNCH_RETRIES\":\"5\",\"FRAMEWORK_ENABLE_MESOS_SEC\":\"true\",\"FRAMEWORK_DOCKER_IMAGE_FORCE_PULL\":\"true\",\"POSTGRES_GOSEC_ALLOW_ORPHAN_RESOURCES\":\"true\",\"POSTGRES_WAL_DISK_TYPE\":\"ROOT\",\"FRAMEWORK_ENABLE_AUTOMATIC_FAILOVER\":\"true\",\"FRAMEWORK_DNS_DOMAIN\":\"mesos\",\"POSTGRES_CPU\":\"1\",\"REALM\":\"NIGHTLYFORWARD.LABS.STRATIO.COM\",\"FRAMEWORK_AVAILABILITY_ZONES_PATTERN\":\"dc(1|2)\",\"POSTGRES_GOSEC_DISABLE_COLUMN_PERMISSIONS\":\"false\",\"FRAMEWORK_ENABLE_API_SECURITY\":\"false\",\"POSTGRES_GOSEC_DOCKER_IMAGE\":\"daedalus-qa.labs.stratio.com:5007/stratio/postgres-agent:1.8.0\",\"POSTGRES_RESTORE_PATH\":\"/tmp/s000001-postgrestls.s000001\",\"POSTGRES_RESTORE_MODE\":\"false\",\"POSTGRES_RESTORE_HDFS_CONFIG_URL\":\"\",\"POSTGRES_AGENT_NODE_PLACEMENT\":\"\",\"FRAMEWORK_INITIAL_INTERNAL_CONFIG\":\"\",\"POSTGRES_LOG_LEVEL\":\"INFO\",\"VAULT_ROLE\":\"s000001\",\"POSTGRES_INDEX_DISK_TYPE\":\"ROOT\",\"POSTGRES_SYNC_SLAVE_NODE_PLACEMENT\":\"\",\"POSTGRES_GOSEC_REVOKE_PUBLIC\":\"false\",\"API_AUTHORIZED_CN\":\"deploy-api\",\"FRAMEWORK_ZOOKEEPER\":\"master.mesos:2181\",\"POSTGRES_GOSEC_LOG_LEVEL\":\"INFO\",\"KADMIN_HOST\":\"kerberos.nightlyforward.labs.stratio.com:749\",\"FRAMEWORK_MESOS_MASTER\":\"master.mesos:2181\",\"FRAMEWORK_LOG_LEVEL\":\"INFO\",\"KDC_UDP_ENABLED\":\"true\",\"FRAMEWORK_ETCD_ENDPOINTS\":\"https://etcd-client.service.eos.nightlyforward.labs.stratio.com:2379\",\"FRAMEWORK_DNS_TYPE\":\"mesos\",\"AGENT_ENABLE_OWNER_REPARENTING\":\"false\",\"KDC_HOST\":\"kerberos.nightlyforward.labs.stratio.com:88\",\"POSTGRES_DATA_DISK_TYPE\":\"ROOT\",\"POSTGRES_GOSEC_SERVICES_URL\":\"gosec-services-daas.marathon.mesos:8443\",\"VAULT_PORT\":\"8200\",\"POSTGRES_VERSION\":\"12\",\"APPROLE\":{\"secret\":\"role\"},\"VAULT_HOSTS\":\"vault.service.eos.nightlyforward.labs.stratio.com\",\"POSTGRES_GOSEC_DOCKER_IMAGE_FORCE_PULL\":\"true\",\"POSTGRES_MEMORY\":\"1024\",\"POSTGRES_MASTER_NODE_PLACEMENT\":\"\",\"POSTGRES_RESTORE_TARGET_TIME\":\"latest\",\"POSTGRES_DATA_DISK\":\"4096\",\"POSTGRES_RESTORE_TYPE\":\"hdfs\",\"POSTGRES_WAL_ARCHIVER_HDFS_CONFIG_URL\":\"\",\"POSTGRES_GOSEC_IDENTITIES_URL\":\"gosec-identities-daas.marathon.mesos:8443\",\"POSTGRES_GOSEC_REFRESH_PERIOD\":\"15\",\"FRAMEWORK_LOST_STATE_TIMEOUT_SECONDS\":\"60\"}}";
        assertThat(cct.checkServiceStatusInResponse("HEALTHY", response, 3 , "pg-[\\d]*")).as("Not as expected").isEqualTo(false);
    }

    @Test
    public void testCheckStatusOneTasKHealty() throws Exception {
        ThreadProperty.set("class", this.getClass().getCanonicalName());
        CommonG commong = new CommonG();
        CCTSpec cct = new CCTSpec(commong);
        String response = "{\"id\":\"/s000001/s000001-postgrestls\",\"tenant\":\"s000001\",\"service\":\"postgres\",\"model\":\"default\",\"version\":\"0.7.0\",\"release\":\"0.7\",\"serviceLabel\":\"s000001-postgrestls.s000001\",\"resources\":{\"disk\":36864.0,\"mem\":5120.0,\"gpus\":0.0,\"cpus\":6.0},\"status\":\"RUNNING\",\"healthiness\":\"HEALTHY\",\"tasks\":[{\"id\":\"s000001_s000001-postgrestls.3a0834d5-6d57-11ea-94e2-dec4ac2bea30\",\"name\":\"s000001-postgrestls.s000001\",\"status\":\"RUNNING\",\"healthiness\":\"HEALTHY\",\"timestamp\":1585003230000,\"resources\":{\"disk\":0.0,\"mem\":1024.0,\"gpus\":0.0,\"cpus\":1.0},\"host\":\"10.200.15.26\",\"securedHost\":\"172.16.104.129\",\"frameworkId\":\"s000001-postgrestls.s000001\"}],\"env\":{\"POSTGRES_WAL_ARCHIVER_PATH\":\"/tmp\",\"POSTGRES_WAL_ARCHIVER\":\"false\",\"APPNAME\":\"postgrestls\",\"FRAMEWORK_DOCKER_IMAGE\":\"daedalus-qa.labs.stratio.com:5007/stratio/postgresql-community:1.9.1\",\"AGENT_OWNER_REPARENT_WHITELIST\":\"\",\"POSTGRES_GOSEC_SECURITY\":\"true\",\"FRAMEWORK_AVAILABILITY_ZONES_LABEL\":\"dc\",\"FRAMEWORK_DOCKER_RETRY_DELAY_SECONDS\":\"5\",\"FRAMEWORK_AVAILABILITY_ZONES_NUMBER\":\"2\",\"FRAMEWORK_MESOS_ROLE\":\"s000001-postgrestls.s000001\",\"POSTGRES_SECURITY_TYPE\":\"TLS\",\"POSTGRES_ENABLE_HIGH_AVAILABILITY\":\"true\",\"AGENT_OWNER_TO_REPARENT\":\"\",\"FRAMEWORK_ENABLE_AVAILABILITY_ZONES\":\"false\",\"POSTGRES_INDEX_DISK\":\"4096\",\"POSTGRES_WAL_DISK\":\"4096\",\"POSTGRES_RESTORE_SNAPSHOT_LABEL\":\"\",\"POSTGRES_GOSEC_URL_AUTH\":\"bootstrap.nightlyforward.labs.stratio.com\",\"POSTGRES_ASYNC_SLAVE_NODE_PLACEMENT\":\"\",\"FRAMEWORK_ENABLE_MARATHON_SEC\":\"true\",\"FRAMEWORK_ISOLATION_NETWORK_NAME\":\"s000001-core\",\"POSTGRES_GOSEC_ALLOW_IN_PERM_CONFLICT\":\"false\",\"POSTGRES_GOSEC_VERSION\":\"1.4.1\",\"POSTGRES_WAL_ARCHIVER_TYPE\":\"hdfs\",\"FRAMEWORK_DOCKER_LAUNCH_RETRIES\":\"5\",\"FRAMEWORK_ENABLE_MESOS_SEC\":\"true\",\"FRAMEWORK_DOCKER_IMAGE_FORCE_PULL\":\"true\",\"POSTGRES_GOSEC_ALLOW_ORPHAN_RESOURCES\":\"true\",\"POSTGRES_WAL_DISK_TYPE\":\"ROOT\",\"FRAMEWORK_ENABLE_AUTOMATIC_FAILOVER\":\"true\",\"FRAMEWORK_DNS_DOMAIN\":\"mesos\",\"POSTGRES_CPU\":\"1\",\"REALM\":\"NIGHTLYFORWARD.LABS.STRATIO.COM\",\"FRAMEWORK_AVAILABILITY_ZONES_PATTERN\":\"dc(1|2)\",\"POSTGRES_GOSEC_DISABLE_COLUMN_PERMISSIONS\":\"false\",\"FRAMEWORK_ENABLE_API_SECURITY\":\"false\",\"POSTGRES_GOSEC_DOCKER_IMAGE\":\"daedalus-qa.labs.stratio.com:5007/stratio/postgres-agent:1.8.0\",\"POSTGRES_RESTORE_PATH\":\"/tmp/s000001-postgrestls.s000001\",\"POSTGRES_RESTORE_MODE\":\"false\",\"POSTGRES_RESTORE_HDFS_CONFIG_URL\":\"\",\"POSTGRES_AGENT_NODE_PLACEMENT\":\"\",\"FRAMEWORK_INITIAL_INTERNAL_CONFIG\":\"\",\"POSTGRES_LOG_LEVEL\":\"INFO\",\"VAULT_ROLE\":\"s000001\",\"POSTGRES_INDEX_DISK_TYPE\":\"ROOT\",\"POSTGRES_SYNC_SLAVE_NODE_PLACEMENT\":\"\",\"POSTGRES_GOSEC_REVOKE_PUBLIC\":\"false\",\"API_AUTHORIZED_CN\":\"deploy-api\",\"FRAMEWORK_ZOOKEEPER\":\"master.mesos:2181\",\"POSTGRES_GOSEC_LOG_LEVEL\":\"INFO\",\"KADMIN_HOST\":\"kerberos.nightlyforward.labs.stratio.com:749\",\"FRAMEWORK_MESOS_MASTER\":\"master.mesos:2181\",\"FRAMEWORK_LOG_LEVEL\":\"INFO\",\"KDC_UDP_ENABLED\":\"true\",\"FRAMEWORK_ETCD_ENDPOINTS\":\"https://etcd-client.service.eos.nightlyforward.labs.stratio.com:2379\",\"FRAMEWORK_DNS_TYPE\":\"mesos\",\"AGENT_ENABLE_OWNER_REPARENTING\":\"false\",\"KDC_HOST\":\"kerberos.nightlyforward.labs.stratio.com:88\",\"POSTGRES_DATA_DISK_TYPE\":\"ROOT\",\"POSTGRES_GOSEC_SERVICES_URL\":\"gosec-services-daas.marathon.mesos:8443\",\"VAULT_PORT\":\"8200\",\"POSTGRES_VERSION\":\"12\",\"APPROLE\":{\"secret\":\"role\"},\"VAULT_HOSTS\":\"vault.service.eos.nightlyforward.labs.stratio.com\",\"POSTGRES_GOSEC_DOCKER_IMAGE_FORCE_PULL\":\"true\",\"POSTGRES_MEMORY\":\"1024\",\"POSTGRES_MASTER_NODE_PLACEMENT\":\"\",\"POSTGRES_RESTORE_TARGET_TIME\":\"latest\",\"POSTGRES_DATA_DISK\":\"4096\",\"POSTGRES_RESTORE_TYPE\":\"hdfs\",\"POSTGRES_WAL_ARCHIVER_HDFS_CONFIG_URL\":\"\",\"POSTGRES_GOSEC_IDENTITIES_URL\":\"gosec-identities-daas.marathon.mesos:8443\",\"POSTGRES_GOSEC_REFRESH_PERIOD\":\"15\",\"FRAMEWORK_LOST_STATE_TIMEOUT_SECONDS\":\"60\"}}";

    }
}
