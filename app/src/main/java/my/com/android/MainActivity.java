package my.com.android;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

import my.android.ios.ActionSheetDialog;
import my.android.ios.ActionSheetDialog.OnSheetItemClickListener;
import my.android.ios.ActionSheetDialog.SheetItemColor;
import my.android.ios.AlertDialog;
import my.android.ios.MyAlertDialog;
import my.android.ios.pickview.wheelcity.AddressData;
import my.android.ios.pickview.wheelcity.OnWheelChangedListener;
import my.android.ios.pickview.wheelcity.WheelView;
import my.android.ios.pickview.wheelcity.adapters.AbstractWheelTextAdapter;
import my.android.ios.pickview.wheelcity.adapters.ArrayWheelAdapter;
import my.android.ios.pickview.wheelview.ScreenInfo;
import my.android.ios.pickview.wheelview.WheelMain;

public class MainActivity extends ActionBarActivity implements OnClickListener {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;

    String cityTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                new ActionSheetDialog(MainActivity.this).builder().setTitle
                        ("清空消息列表后，聊天记录依然保留，确定要清空消息列表？").setCancelable(false)
                        .setCanceledOnTouchOutside(false).addSheetItem("清空消息列表", SheetItemColor
                        .Red, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).show();
                break;
            case R.id.btn2:
                new ActionSheetDialog(MainActivity.this).builder().setCancelable(false)
                        .setCanceledOnTouchOutside(false).addSheetItem("发送给好友", SheetItemColor
                        .Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).addSheetItem("转载到空间相册", SheetItemColor.Blue, new
                        OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {

                    }
                }).addSheetItem("上传到群相册", SheetItemColor.Blue, new OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {

                    }
                }).addSheetItem("保存到手机", SheetItemColor.Blue, new OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {

                    }
                }).addSheetItem("收藏", SheetItemColor.Blue, new OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {

                    }
                }).addSheetItem("查看聊天图片", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        }).show();
                break;
            case R.id.btn3:
                new ActionSheetDialog(MainActivity.this).builder().setTitle("请选择操作")
                        .setCancelable(false).setCanceledOnTouchOutside(false).addSheetItem
                        ("条目一", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).addSheetItem("条目二", SheetItemColor.Blue, new OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {
                        Toast.makeText(MainActivity.this, "item" + which, Toast.LENGTH_SHORT)
                                .show();
                    }
                }).addSheetItem("条目三", SheetItemColor.Blue, new OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {
                        Toast.makeText(MainActivity.this, "item" + which, Toast.LENGTH_SHORT)
                                .show();
                    }
                }).addSheetItem("条目四", SheetItemColor.Blue, new OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {
                        Toast.makeText(MainActivity.this, "item" + which, Toast.LENGTH_SHORT)
                                .show();
                    }
                }).addSheetItem("条目五", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).addSheetItem("条目六", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).addSheetItem("条目七", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).addSheetItem("条目八", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).addSheetItem("条目九", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).addSheetItem("条目十", SheetItemColor.Blue, new OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {
                                Toast.makeText(MainActivity.this, "item" + which, Toast
                                        .LENGTH_SHORT).show();
                            }
                        }).show();
                break;
            case R.id.btn4:
                new AlertDialog(MainActivity.this).builder().setTitle("退出当前账号").setMsg
                        ("再连续登陆15天，就可变身为QQ达人。退出QQ可能会使你现有记录归零，确定退出？").setPositiveButton("确认退出",
                        new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).setNegativeButton("取消", new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
                break;
            case R.id.btn5:
                new AlertDialog(MainActivity.this).builder().setMsg
                        ("你现在无法接收到新消息提醒。请到系统-设置-通知中开启消息提醒").setNegativeButton("确定", new
                        OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
                break;

            case R.id.btn6:
                LayoutInflater inflater1 = LayoutInflater.from(MainActivity.this);
                final View timepickerview1 = inflater1.inflate(R.layout.timepicker, null);
                ScreenInfo screenInfo1 = new ScreenInfo(MainActivity.this);
                final WheelMain wheelMain = new WheelMain(timepickerview1, true);
                wheelMain.screenheight = screenInfo1.getHeight();
                //                String time1 = txttime.getText().toString();
                Calendar calendar1 = Calendar.getInstance();
                //                if (JudgeDate.isDate(time1, "yyyy-MM-dd")) {
                //                    try {
                //                        calendar1.setTime(dateFormat.parse(time1));
                //                    } catch (ParseException e) {
                //                        // TODO Auto-generated catch block
                //                        e.printStackTrace();
                //                    }
                //                }
                int year1 = calendar1.get(Calendar.YEAR);
                int month1 = calendar1.get(Calendar.MONTH);
                int day1 = calendar1.get(Calendar.DAY_OF_MONTH);
                wheelMain.initDateTimePicker(year1, month1, day1);
                final MyAlertDialog dialog = new MyAlertDialog(MainActivity.this).builder()
                        .setTitle(btn4.getText().toString())
                        .setView(timepickerview1).setNegativeButton("取消", new OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                dialog.setPositiveButton("保存", new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), wheelMain.getTime(), Toast
                                .LENGTH_SHORT).show();
                    }
                });
                dialog.show();
                break;

            case R.id.btn7:
                View view = dialogm();
                final MyAlertDialog dialog1 = new MyAlertDialog(MainActivity.this).builder()
                        .setTitle(btn5.getText().toString())
                        .setView(view).setNegativeButton("取消", new OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                dialog1.setPositiveButton("保存", new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), cityTxt, Toast.LENGTH_LONG).show();
                    }
                });
                dialog1.show();
                break;

            case R.id.btn8:
                final View chooseTime = getLayoutInflater().inflate(R.layout.dialog_expect_time, null);
                final my.android.ios.pickview.wheelview.WheelView wheelView = (my.android.ios.pickview.wheelview.WheelView) chooseTime.findViewById(R.id.wv_time);
                final String[] times = getResources().getStringArray(R.array.times);


                my.android.ios.pickview.wheelview.ArrayWheelAdapter<String> adapter = new my.android.ios.pickview.wheelview.ArrayWheelAdapter<>(times);
                wheelView.setCyclic(false);
                wheelView.setAdapter(adapter);
                wheelView.TEXT_SIZE = 42;

                final MyAlertDialog dialog2 = new MyAlertDialog(this).builder().setTitle("请选择时间")
                        .setView(chooseTime).setNegativeButton("取消", new OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                dialog2.setPositiveButton("保存", new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                dialog2.show();

                break;
            default:
                break;
        }
    }

    private View dialogm() {
        View contentView = LayoutInflater.from(this).inflate(R.layout.wheelcity_cities_layout,
                null);
        final WheelView country = (WheelView) contentView.findViewById(R.id.wheelcity_country);
        country.setVisibleItems(3);
        country.setViewAdapter(new CountryAdapter(this));

        final String cities[][] = AddressData.CITIES;
        final String ccities[][][] = AddressData.COUNTIES;
        final WheelView city = (WheelView) contentView.findViewById(R.id.wheelcity_city);
        city.setVisibleItems(0);

        // 地区选择
        final WheelView ccity = (WheelView) contentView.findViewById(R.id.wheelcity_ccity);
        ccity.setVisibleItems(0);// 不限城市

        country.addChangingListener(new OnWheelChangedListener() {
            public void onChanged(WheelView wheel, int oldValue, int newValue) {
                updateCities(city, cities, newValue);
                cityTxt = AddressData.PROVINCES[country.getCurrentItem()] + " | " + AddressData
                        .CITIES[country.getCurrentItem()][city.getCurrentItem()] + " | " +
                        AddressData.COUNTIES[country.getCurrentItem()][city.getCurrentItem()
                                ][ccity.getCurrentItem()];
            }
        });

        city.addChangingListener(new OnWheelChangedListener() {
            public void onChanged(WheelView wheel, int oldValue, int newValue) {
                updatecCities(ccity, ccities, country.getCurrentItem(), newValue);
                cityTxt = AddressData.PROVINCES[country.getCurrentItem()] + " | " + AddressData
                        .CITIES[country.getCurrentItem()][city.getCurrentItem()] + " | " +
                        AddressData.COUNTIES[country.getCurrentItem()][city.getCurrentItem()
                                ][ccity.getCurrentItem()];
            }
        });

        ccity.addChangingListener(new OnWheelChangedListener() {
            public void onChanged(WheelView wheel, int oldValue, int newValue) {
                cityTxt = AddressData.PROVINCES[country.getCurrentItem()] + " | " + AddressData
                        .CITIES[country.getCurrentItem()][city.getCurrentItem()] + " | " +
                        AddressData.COUNTIES[country.getCurrentItem()][city.getCurrentItem()
                                ][ccity.getCurrentItem()];
            }
        });

        country.setCurrentItem(1);// 设置北京
        city.setCurrentItem(1);
        ccity.setCurrentItem(1);
        return contentView;
    }

    /**
     * Updates the city wheel
     */
    private void updateCities(WheelView city, String cities[][], int index) {
        ArrayWheelAdapter<String> adapter = new ArrayWheelAdapter<String>(this, cities[index]);
        adapter.setTextSize(18);
        city.setViewAdapter(adapter);
        city.setCurrentItem(0);
    }

    /**
     * Updates the ccity wheel
     */
    private void updatecCities(WheelView city, String ccities[][][], int index, int index2) {
        ArrayWheelAdapter<String> adapter = new ArrayWheelAdapter<String>(this,
                ccities[index][index2]);
        adapter.setTextSize(18);
        city.setViewAdapter(adapter);
        city.setCurrentItem(0);
    }

    /**
     * Adapter for countries
     */
    private class CountryAdapter extends AbstractWheelTextAdapter {
        // Countries names
        private String countries[] = AddressData.PROVINCES;

        /**
         * Constructor
         */
        protected CountryAdapter(Context context) {
            super(context, R.layout.wheelcity_country_layout, NO_RESOURCE);
            setItemTextResource(R.id.wheelcity_country_name);
        }

        @Override
        public View getItem(int index, View cachedView, ViewGroup parent) {
            View view = super.getItem(index, cachedView, parent);
            return view;
        }

        @Override
        public int getItemsCount() {
            return countries.length;
        }

        @Override
        protected CharSequence getItemText(int index) {
            return countries[index];
        }
    }

}
