package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyd implements TextWatcher {
    int a;
    final /* synthetic */ EditText b;
    final /* synthetic */ TextInputLayout c;

    public iyd(TextInputLayout textInputLayout, EditText editText) {
        this.b = editText;
        this.c = textInputLayout;
        this.a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.c.z(!r0.r);
        TextInputLayout textInputLayout = this.c;
        if (textInputLayout.e) {
            textInputLayout.w(editable);
        }
        TextInputLayout textInputLayout2 = this.c;
        if (textInputLayout2.j) {
            textInputLayout2.A(editable);
        }
        int lineCount = this.b.getLineCount();
        int i = this.a;
        if (lineCount != i) {
            if (lineCount < i) {
                EditText editText = this.b;
                TextInputLayout textInputLayout3 = this.c;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout3.o;
                if (minimumHeight != i2) {
                    this.b.setMinimumHeight(i2);
                }
            }
            this.a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
