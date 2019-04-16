package com.example.roza.medicalrecordings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.example.roza.medicalrecordings.Model.DataItem;
import com.example.roza.medicalrecordings.Model.SubCategoryItem;

import java.util.ArrayList;
import java.util.HashMap;

public class SystemicDiseases extends AppCompatActivity {

    private Button btn;
    private ExpandableListView lvCategory;

    private ArrayList<DataItem> arCategory;
    private ArrayList<SubCategoryItem> arSubCategory;
    private ArrayList<ArrayList<SubCategoryItem>> arSubCategoryFinal;

    private ArrayList<HashMap<String, String>> parentItems;
    private ArrayList<ArrayList<HashMap<String, String>>> childItems;
    private MyCategoriesExpandableListAdapter myCategoriesExpandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systemic_diseases);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SystemicDiseases.this,CheckedActivity.class);
                startActivity(intent);
            }
        });

        setupReferences();
    }

    private void setupReferences() {

        lvCategory = findViewById(R.id.lvCategory);
        arCategory = new ArrayList<>();
        arSubCategory = new ArrayList<>();
        parentItems = new ArrayList<>();
        childItems = new ArrayList<>();

        DataItem dataItem = new DataItem();
        dataItem.setCategoryId("1");
        dataItem.setCategoryName("Hypertension");


        //sub1
        arSubCategory = new ArrayList<>();
        SubCategoryItem subCategoryItem = new SubCategoryItem();
        subCategoryItem.setCategoryId(String.valueOf(1));
        subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem.setSubCategoryName("Pre-hypertensive (120–139/80–89 mmHg)");
        arSubCategory.add(subCategoryItem);

        //sub2
        SubCategoryItem subCategoryItem2 = new SubCategoryItem();
        subCategoryItem2.setCategoryId(String.valueOf(2));
        subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem2.setSubCategoryName("Stage 1 Hypertensive (140–159/ 90–99 mmHg)");
        arSubCategory.add(subCategoryItem2);

       //sub3

        SubCategoryItem subCategoryItem3 = new SubCategoryItem();
        subCategoryItem3.setCategoryId(String.valueOf(3));
        subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem3.setSubCategoryName("Stage 2 Hypertensive (=>160 / =>100 mmHg)");
        arSubCategory.add(subCategoryItem3);


        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);
        //cat
        dataItem = new DataItem();
        dataItem.setCategoryId("2");
        dataItem.setCategoryName("Diabetes");
        arSubCategory = new ArrayList<>();
        SubCategoryItem subCategoryItem21 = new SubCategoryItem();
        subCategoryItem21.setCategoryId(String.valueOf(1));
        subCategoryItem21.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem21.setSubCategoryName("Pre-diabetic");
        arSubCategory.add(subCategoryItem21);


        //sub2
        SubCategoryItem subCategoryItem22 = new SubCategoryItem();
        subCategoryItem22.setCategoryId(String.valueOf(2));
        subCategoryItem22.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem22.setSubCategoryName("Controlled diabetic");
        arSubCategory.add(subCategoryItem22);

        //sub3
        SubCategoryItem subCategoryItem23 = new SubCategoryItem();
        subCategoryItem23.setCategoryId(String.valueOf(3));
        subCategoryItem23.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem23.setSubCategoryName("UnControlled diabetic");
        arSubCategory.add(subCategoryItem23);


        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("3");
        dataItem.setCategoryName("CVD");
        arSubCategory = new ArrayList<>();
        SubCategoryItem subCategoryItem31 = new SubCategoryItem();
        subCategoryItem31.setCategoryId(String.valueOf(1));
        subCategoryItem31.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem31.setSubCategoryName("Atherosclerosis");
        arSubCategory.add(subCategoryItem31);

        //sub2
        SubCategoryItem subCategoryItem32 = new SubCategoryItem();
        subCategoryItem32.setCategoryId(String.valueOf(2));
        subCategoryItem32.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem32.setSubCategoryName("Angina");
        arSubCategory.add(subCategoryItem32);

        //sub3
        SubCategoryItem subCategoryItem33 = new SubCategoryItem();
        subCategoryItem33.setCategoryId(String.valueOf(3));
        subCategoryItem33.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem33.setSubCategoryName("MI");
        arSubCategory.add(subCategoryItem33);



        //sub4
        SubCategoryItem subCategoryItem34 = new SubCategoryItem();
        subCategoryItem34.setCategoryId(String.valueOf(4));
        subCategoryItem34.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem34.setSubCategoryName("Atherosclerosis");
        arSubCategory.add(subCategoryItem34);


        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);



        dataItem = new DataItem();
        dataItem.setCategoryId("4");
        dataItem.setCategoryName("Liver Diseases");
        arSubCategory = new ArrayList<>();
        SubCategoryItem subCategoryItem41 = new SubCategoryItem();
        subCategoryItem41.setCategoryId(String.valueOf(1));
        subCategoryItem41.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem41.setSubCategoryName("HPAV");
        arSubCategory.add(subCategoryItem41);


        SubCategoryItem subCategoryItem42 = new SubCategoryItem();
        subCategoryItem42.setCategoryId(String.valueOf(2));
        subCategoryItem42.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem42.setSubCategoryName("HPBV");
        arSubCategory.add(subCategoryItem42);


        SubCategoryItem subCategoryItem43 = new SubCategoryItem();
        subCategoryItem43.setCategoryId(String.valueOf(3));
        subCategoryItem43.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
        subCategoryItem43.setSubCategoryName("HPCV");
        arSubCategory.add(subCategoryItem34);





        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        Log.d("TAG", "setupReferences: "+arCategory.size());

        for(DataItem data : arCategory){
//                        Log.i("Item id",item.id);
            ArrayList<HashMap<String, String>> childArrayList =new ArrayList<HashMap<String, String>>();
            HashMap<String, String> mapParent = new HashMap<String, String>();

            mapParent.put(ConstantManager.Parameter.CATEGORY_ID,data.getCategoryId());
            mapParent.put(ConstantManager.Parameter.CATEGORY_NAME,data.getCategoryName());

            int countIsChecked = 0;
            for(SubCategoryItem itm : data.getSubCategory()) {

                HashMap<String, String> mapChild = new HashMap<String, String>();
                mapChild.put(ConstantManager.Parameter.SUB_ID,itm.getSubId());
                mapChild.put(ConstantManager.Parameter.SUB_CATEGORY_NAME,itm.getSubCategoryName());
                mapChild.put(ConstantManager.Parameter.CATEGORY_ID,itm.getCategoryId());
                mapChild.put(ConstantManager.Parameter.IS_CHECKED,itm.getIsChecked());

                if(subCategoryItem.getIsChecked().equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {

                    countIsChecked++;
                }
                childArrayList.add(mapChild);
            }

            if(countIsChecked == data.getSubCategory().size()) {

                data.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_TRUE);
            }else {
                data.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            }

            mapParent.put(ConstantManager.Parameter.IS_CHECKED,data.getIsChecked());
            childItems.add(childArrayList);
            parentItems.add(mapParent);

        }

        ConstantManager.parentItems = parentItems;
        ConstantManager.childItems = childItems;

        myCategoriesExpandableListAdapter = new MyCategoriesExpandableListAdapter(this,parentItems,childItems,false);
        lvCategory.setAdapter(myCategoriesExpandableListAdapter);
    }
}
