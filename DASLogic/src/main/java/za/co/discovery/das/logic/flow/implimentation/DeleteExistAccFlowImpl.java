package za.co.discovery.das.logic.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.discovery.das.logic.flow.DeleteExistAccFlow;

import javax.transaction.Transactional;

@Transactional
@Component
public class DeleteExistAccFlowImpl implements DeleteExistAccFlow {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteExistAccFlowImpl.class);
}
