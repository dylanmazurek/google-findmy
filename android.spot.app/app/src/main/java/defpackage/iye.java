package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iye extends buk {
    private final TextInputLayout a;

    public iye(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        String str;
        TextView textView;
        super.c(view, bynVar);
        EditText editText = this.a.c;
        CharSequence charSequence3 = null;
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        TextInputLayout textInputLayout = this.a;
        CharSequence d = textInputLayout.d();
        CharSequence c = textInputLayout.c();
        if (textInputLayout.j) {
            charSequence2 = textInputLayout.i;
        } else {
            charSequence2 = null;
        }
        int i = textInputLayout.f;
        if (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) {
            charSequence3 = textView.getContentDescription();
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(d);
        boolean z2 = this.a.p;
        boolean isEmpty3 = TextUtils.isEmpty(c);
        boolean z3 = !isEmpty3;
        if (isEmpty3 && TextUtils.isEmpty(charSequence3)) {
            z = false;
        } else {
            z = true;
        }
        if (!isEmpty2) {
            str = d.toString();
        } else {
            str = "";
        }
        iyc iycVar = this.a.a;
        if (iycVar.a.getVisibility() == 0) {
            bynVar.F(iycVar.a);
            bynVar.T(iycVar.a);
        } else {
            bynVar.T(iycVar.c);
        }
        if (!isEmpty) {
            bynVar.S(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            bynVar.S(str);
            if (!z2 && charSequence2 != null) {
                bynVar.S(str + ", " + charSequence2.toString());
            }
        } else if (charSequence2 != null) {
            bynVar.S(charSequence2);
        }
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                bynVar.E(str);
            } else {
                if (!isEmpty) {
                    str = String.valueOf(charSequence) + ", " + str;
                }
                bynVar.S(str);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                bynVar.b.setShowingHintText(isEmpty);
            } else {
                bynVar.o(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != i) {
            i = -1;
        }
        bynVar.H(i);
        if (z) {
            if (true != z3) {
                c = charSequence3;
            }
            bynVar.A(c);
        }
        View view2 = this.a.d.o;
        if (view2 != null) {
            bynVar.F(view2);
        }
        this.a.b.c().u(bynVar);
    }

    @Override // defpackage.buk
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = TextInputLayout.s;
        this.a.b.c().v(accessibilityEvent);
    }
}
