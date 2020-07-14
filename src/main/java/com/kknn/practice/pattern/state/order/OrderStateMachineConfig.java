package com.kknn.practice.pattern.state.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.StateMachinePersist;
import org.springframework.statemachine.config.StateMachineConfig;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.*;
import org.springframework.statemachine.config.common.annotation.AnnotationBuilder;
import org.springframework.statemachine.persist.DefaultStateMachinePersister;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.statemachine.config.EnableStateMachine;

import java.util.EnumSet;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
@Configuration
@EnableStateMachine(name = "orderStatusMachine")
public class OrderStateMachineConfig extends StateMachineConfigurerAdapter<OrderStatus, OrderStatusChangeEvent> {

    /**
     * 配置状态及初始化状态
     */
    @Override
    public void configure(StateMachineStateConfigurer<OrderStatus, OrderStatusChangeEvent> states) throws Exception {
        states.withStates().initial(OrderStatus.WAIT_PAYMENT).states(EnumSet.allOf(OrderStatus.class));
    }

    /**
     * 配置状态转换关系
     */
    @Override
    public void configure(StateMachineTransitionConfigurer<OrderStatus, OrderStatusChangeEvent> transitions) throws Exception {
        transitions.withExternal().source(OrderStatus.WAIT_PAYMENT).target(OrderStatus.WAIT_DELIVER).event(OrderStatusChangeEvent.PAYED)
                .and().withExternal().source(OrderStatus.WAIT_DELIVER).target(OrderStatus.WAIT_RECEIVE).event(OrderStatusChangeEvent.DELIVERY)
                .and().withExternal().source(OrderStatus.WAIT_RECEIVE).target(OrderStatus.FINISH).event(OrderStatusChangeEvent.RECEIVED);
    }

    @Bean
    public DefaultStateMachinePersister persister() {
        return new DefaultStateMachinePersister<Object, Object, Order>(new StateMachinePersist<Object, Object, Order>() {

            @Override
            public void write(StateMachineContext<Object, Object> context, Order order) throws Exception {
               //持久化
            }

            @Override
            public StateMachineContext<Object, Object> read(Order order) throws Exception {
                return new DefaultStateMachineContext<>(order.getStatus(), null, null, null, null);
            }
        });
    }


    @Override
    public void configure(StateMachineConfigurationConfigurer<OrderStatus, OrderStatusChangeEvent> config) throws Exception {
        super.configure(config);
    }

    @Override
    public void configure(StateMachineConfigBuilder<OrderStatus, OrderStatusChangeEvent> config) throws Exception {
        super.configure(config);
    }

    @Override
    public void configure(StateMachineModelConfigurer<OrderStatus, OrderStatusChangeEvent> model) throws Exception {
        super.configure(model);
    }

    @Override
    public boolean isAssignable(AnnotationBuilder<StateMachineConfig<OrderStatus, OrderStatusChangeEvent>> builder) {
        return super.isAssignable(builder);
    }
}
