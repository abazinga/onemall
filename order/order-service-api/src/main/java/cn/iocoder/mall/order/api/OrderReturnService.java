package cn.iocoder.mall.order.api;

import cn.iocoder.common.framework.vo.CommonResult;
import cn.iocoder.mall.order.api.bo.OrderReturnInfoBO;
import cn.iocoder.mall.order.api.bo.OrderReturnListBO;
import cn.iocoder.mall.order.api.dto.OrderReturnApplyDTO;
import cn.iocoder.mall.order.api.dto.OrderReturnQueryDTO;

/**
 * 订单退货
 *
 * @author Sin
 * @time 2019-03-30 15:33
 */
public interface OrderReturnService {


    /**
     * 订单 - 退货
     *
     * @param orderReturnApplyDTO
     * @return
     */
    CommonResult orderReturnApply(OrderReturnApplyDTO orderReturnApplyDTO);

    /**
     * 更新退款成功
     *
     * 如果成功，则返回 success
     * 如果失败，则返回具体原因
     *
     * @param orderId 订单编号
     * @param refundPrice 退款金额
     * @return 支付结果
     */
    String updateRefundSuccess(String orderId, Integer refundPrice);

    /**
     * 订单申请信息
     *
     * @param orderId
     * @return
     */
    CommonResult<OrderReturnInfoBO> orderApplyInfo(Integer orderId);

    /**
     * 订单退货 - 列表
     *
     * @param queryDTO
     * @return
     */
    CommonResult<OrderReturnListBO> orderReturnList(OrderReturnQueryDTO queryDTO);
}
