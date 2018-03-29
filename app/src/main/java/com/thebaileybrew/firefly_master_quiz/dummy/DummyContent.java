package com.thebaileybrew.firefly_master_quiz.dummy;

import com.thebaileybrew.firefly_master_quiz.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 10;

    static {
        // Add some sample items.
        addItem(new DummyItem("1","Question One", R.layout.question_one));
        addItem(new DummyItem("2","Question Two", R.layout.question_two));
        addItem(new DummyItem("3","Question Three", R.layout.question_three));
        addItem(new DummyItem("4","Question Four", R.layout.question_four));
        addItem(new DummyItem("5","Question Five", R.layout.question_five));
        addItem(new DummyItem("6","Question Six", R.layout.question_six));
        addItem(new DummyItem("7","Question Seven", R.layout.question_seven));
        addItem(new DummyItem("8","Question Eight", R.layout.question_eight));
        addItem(new DummyItem("9","Question Nine", R.layout.question_nine));
        addItem(new DummyItem("10","Question Ten", R.layout.question_ten));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String question_title;
        public final int resourceId;

        public DummyItem(String id, String question_title, int resourceId) {
            this.id = id;
            this.question_title = question_title;
            this.resourceId = resourceId;
        }

        @Override
        public String toString() {
            return question_title;
        }
    }
}
