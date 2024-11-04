package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egx extends egz {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/factoryreset/FactoryResetDeviceFragment");
    public ebf af;
    public bso ag;
    public dhx ah;
    private lqd ai;
    private TextView aj;
    public ewc b;
    public BidiFormatter c;
    public evo d;
    public lqc e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lpt lptVar;
        int i;
        String T;
        int i2;
        if (this.e == null) {
            return null;
        }
        View inflate = LayoutInflater.from(y()).inflate(R.layout.fragment_full_screen_factory_reset_device, viewGroup, false);
        cs csVar = (cs) F();
        csVar.i((Toolbar) inflate.findViewById(R.id.toolbar));
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        ch g2 = csVar.g();
        g2.getClass();
        g2.s();
        if (this.e != null) {
            Button button = (Button) inflate.findViewById(R.id.reset_button);
            if (button != null) {
                button.setText(R.string.reset);
                button.setOnClickListener(new efe(this, 6));
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.device_icon);
            if (imageView != null) {
                eyf.l(this.e, imageView);
            }
            String str = this.e.g;
            TextView textView = (TextView) inflate.findViewById(R.id.device_title);
            if (textView != null && !TextUtils.isEmpty(str)) {
                textView.setText(this.c.unicodeWrap(str));
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.how_it_works_item_1);
            this.aj = textView2;
            if (textView2 != null) {
                lqc lqcVar = this.e;
                if (lqcVar.b == 3) {
                    lptVar = (lpt) lqcVar.c;
                } else {
                    lptVar = lpt.C;
                }
                boolean contains = new ljt(lptVar.n, lpt.o).contains(lqg.TOKEN_TYPE_CAR);
                TextView textView3 = this.aj;
                if (!TextUtils.isEmpty(str) && eyf.q(this.e)) {
                    if (true != contains) {
                        i2 = R.string.factory_reset_all_data_erased_text_with_device_name;
                    } else {
                        i2 = R.string.factory_reset_all_data_including_dck_erased_text_with_device_name;
                    }
                    T = U(i2, this.c.unicodeWrap(str));
                } else {
                    if (true != contains) {
                        i = R.string.factory_reset_all_data_erased_text;
                    } else {
                        i = R.string.factory_reset_all_data_including_dck_erased_text;
                    }
                    T = T(i);
                }
                textView3.setText(T);
            }
            return inflate;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        ((cfk) this.ah.a).g(O(), new egv(this, 2));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ai = eyf.g(A());
        jer b = eyf.b(this.b.c, this.ai);
        if (!b.g()) {
            ((jni) ((jni) a.f().h(jop.a, "FactoryResetDeviceFrg")).j("com/google/android/apps/adm/integrations/android/factoryreset/FactoryResetDeviceFragment", "onCreate", 73, "FactoryResetDeviceFragment.java")).r("Device not found");
        } else {
            this.e = (lqc) b.c();
        }
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        if (this.aj != null) {
            Context y = y();
            TextView textView = this.aj;
            fma.bQ(y, textView, textView.getText());
        }
    }
}
