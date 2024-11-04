package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.adm.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ips extends caf {
    final /* synthetic */ Chip e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ips(Chip chip, Chip chip2) {
        super(chip2);
        this.e = chip;
    }

    @Override // defpackage.caf
    protected final void k(List list) {
        list.add(0);
        this.e.j();
    }

    @Override // defpackage.caf
    protected final void l(byn bynVar) {
        bynVar.r(this.e.h());
        bynVar.u(this.e.isClickable());
        bynVar.t(this.e.getAccessibilityClassName());
        CharSequence text = this.e.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            bynVar.S(text);
        } else {
            bynVar.x(text);
        }
    }

    @Override // defpackage.caf
    protected final void m(int i, byn bynVar) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.e;
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            if (true != TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            bynVar.x(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            Chip chip2 = this.e;
            RectF c = chip2.c();
            chip2.h.set((int) c.left, (int) c.top, (int) c.right, (int) c.bottom);
            bynVar.p(chip2.h);
            bynVar.j(byi.a);
            bynVar.z(this.e.isEnabled());
            return;
        }
        bynVar.x("");
        bynVar.p(Chip.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.caf
    public final void n(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.e;
            chip.g = z;
            chip.refreshDrawableState();
        }
    }

    @Override // defpackage.caf
    public final boolean q(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.e.performClick();
            }
            if (i == 1) {
                this.e.k();
            }
        }
        return false;
    }
}
