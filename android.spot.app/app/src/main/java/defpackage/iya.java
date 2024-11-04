package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iya extends ixu {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public iya(ixt ixtVar, int i) {
        super(ixtVar);
        this.b = R.drawable.design_password_eye;
        this.c = new ewu(this, 14);
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.ixu
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.ixu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ixu
    public final View.OnClickListener c() {
        return this.c;
    }

    public final boolean f() {
        EditText editText = this.a;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ixu
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.ixu
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.ixu
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.ixu
    public final boolean r() {
        return true;
    }

    @Override // defpackage.ixu
    public final boolean s() {
        if (!f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ixu
    public final void y() {
        x();
    }
}
