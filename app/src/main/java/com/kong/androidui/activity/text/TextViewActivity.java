package com.kong.androidui.activity.text;

import android.os.Bundle;
import android.widget.TextView;

import com.kong.androidui.R;
import com.kong.androidui.activity.base.ABaseActivity;

import me.codeboy.android.aligntextview.AlignTextView;

public class TextViewActivity extends ABaseActivity {

    private TextView tvNormal;
    private AlignTextView alignTextView;
    private String test = "AlignTextView (不支持选择复制，在不需要进行选择复制的情况下使用，排版效果好)?CBAlignTextView (新的版本，支持选择复制，排版效果比较的好)本词条缺少名片图，补充相关内容使词条更完整，还能快速升级，赶紧来编辑吧！\n" +
            "ADS，American Depositary Shares， 即美国存托股份或 美国存托凭证(ADRs)，Beckhoff TwinCAT 系统中，联合数据[ADS]美股实时行情_百度股市通\n" +
            "218.62+1.23(+0.57%)各个软件模块（如TwinCAT PLC、TwinCAT NC、Windows 应用程序等）的工作模式类似于硬件设备，它们能够独立工作。各个软件模块之间的信息交换通过TwinCAT ADS 而完成。ADS（Advanced Design System）即先进设计...允许外国的股票在美国股票交易所交易。事实上，大多数的外国公司股票以这种方式在美国股票交易所交易。美国存托凭证由美国的存托银行发行，每个ADR代表了一个或者多个外国的股票，或者一小部分股票。当你持有ADR时，你有它所代表的外国股票的权益、凭证。";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tvNormal = (TextView) findViewById(R.id.tv_normal);
        alignTextView = (AlignTextView) findViewById(R.id.tv_align);
        loadData();
    }

    private void loadData() {
        tvNormal.setText(test);
        alignTextView.setText(test);
    }
}
