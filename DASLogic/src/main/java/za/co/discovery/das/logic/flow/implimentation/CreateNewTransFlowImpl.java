package za.co.discovery.das.logic.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.discovery.das.logic.flow.CreateNewTransFlow;

import javax.transaction.Transactional;

@Transactional
@Component
public class CreateNewTransFlowImpl implements CreateNewTransFlow {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateNewTransFlowImpl.class);
}
