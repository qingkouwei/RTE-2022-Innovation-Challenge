package com.qingkouwei.handyinstruction.section.dialog;

import com.qingkouwei.handyinstruction.section.base.BaseActivity;

public class SimpleDialogFragment extends DemoDialogFragment {
    public static final String MESSAGE_KEY = "message";

    @Override
    public void initArgument() {
        if(getArguments() != null) {
            title = getArguments().getString(MESSAGE_KEY);
        }
    }

    public static class Builder extends DemoDialogFragment.Builder {

        public Builder(BaseActivity context) {
            super(context);
        }

        @Override
        protected DemoDialogFragment getFragment() {
            return new SimpleDialogFragment();
        }

    }


}
