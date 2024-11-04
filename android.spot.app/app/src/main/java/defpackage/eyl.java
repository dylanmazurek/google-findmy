package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.adm.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyl {
    public final InputMethodManager a;
    public final boolean b;
    public final boolean c;
    public final TextInputLayout d;
    public final TextInputLayout e;
    public final eca f;
    private final Resources g;

    public eyl(InputMethodManager inputMethodManager, Resources resources, View view, boolean z, boolean z2, boolean z3, eca ecaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        resources.getClass();
        this.g = resources;
        inputMethodManager.getClass();
        this.a = inputMethodManager;
        this.b = z;
        this.c = z2;
        this.f = ecaVar;
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.message);
        this.d = textInputLayout;
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.phone_number);
        this.e = textInputLayout2;
        View findViewById = view.findViewById(R.id.message_section_title);
        View findViewById2 = view.findViewById(R.id.message_section_description);
        View findViewById3 = view.findViewById(R.id.car_key_suspension_notice_section);
        if (true != z3) {
            i = 8;
        } else {
            i = 0;
        }
        findViewById3.setVisibility(i);
        if (true != z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textInputLayout.setVisibility(i2);
        if (true != z2) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        textInputLayout2.setVisibility(i3);
        if (!z && !z2) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        findViewById.setVisibility(i4);
        findViewById2.setVisibility((z || z2) ? 0 : 8);
        if (z) {
            if (z2) {
                EditText editText = textInputLayout.c;
                editText.getClass();
                editText.setImeActionLabel(resources.getString(R.string.next), 0);
                editText.setImeOptions(5);
            } else {
                c(textInputLayout);
            }
        }
        if (z2) {
            c(textInputLayout2);
            EditText editText2 = textInputLayout2.c;
            editText2.getClass();
            editText2.addTextChangedListener(new ezd());
        }
    }

    private final void c(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.c;
        editText.getClass();
        editText.setImeActionLabel(this.g.getString(R.string.secure_device), 0);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new eyk(this, textInputLayout, 0));
    }

    public final String a() {
        if (this.b) {
            EditText editText = this.d.c;
            editText.getClass();
            return editText.getText().toString();
        }
        return null;
    }

    public final String b() {
        if (this.c) {
            EditText editText = this.e.c;
            editText.getClass();
            return editText.getText().toString();
        }
        return null;
    }
}
