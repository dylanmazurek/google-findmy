package defpackage;

import android.app.Activity;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzi extends et {
    private static final fa e = new dzh();
    private final BidiFormatter f;
    private final Activity g;
    private final ezl h;
    private final ewf i;
    private final bym j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dzi(java.util.concurrent.Executor r3, android.text.BidiFormatter r4, defpackage.ezl r5, android.app.Activity r6, defpackage.bym r7, defpackage.ewf r8) {
        /*
            r2 = this;
            r3.getClass()
            r7.getClass()
            r8.getClass()
            eq r0 = new eq
            fa r1 = defpackage.dzi.e
            r0.<init>(r1)
            r0.a = r3
            bfi r3 = r0.a()
            r2.<init>(r3)
            r2.f = r4
            r2.h = r5
            r2.g = r6
            r2.j = r7
            r2.i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzi.<init>(java.util.concurrent.Executor, android.text.BidiFormatter, ezl, android.app.Activity, bym, ewf):void");
    }

    @Override // defpackage.lj
    public final int d(int i) {
        dzp dzpVar = (dzp) b(i);
        if (dzpVar instanceof dzf) {
            return R.id.device_item_item_id;
        }
        if (dzpVar instanceof eac) {
            return R.id.supervised_account_header_item_id;
        }
        if (dzpVar instanceof eaf) {
            return R.id.work_profile_explanation_item_id;
        }
        if (dzpVar instanceof eab) {
            return R.id.more_devices_explanation_item_id;
        }
        throw new mku();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        if (i == R.id.device_item_item_id) {
            return new dzg(viewGroup, this.f, this.j, this.i, R.layout.adm_devicepicker_item);
        }
        if (i == R.id.device_item_item_small_id) {
            return new dzg(viewGroup, this.f, this.j, this.i, R.layout.adm_devicepicker_item_small);
        }
        if (i == R.id.supervised_account_header_item_id) {
            return new ead(viewGroup);
        }
        if (i == R.id.work_profile_explanation_item_id) {
            return new eag(viewGroup, this.h, this.g);
        }
        if (i == R.id.more_devices_explanation_item_id) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.no_devices_explanation, viewGroup, false);
            inflate.getClass();
            return new mh(inflate);
        }
        throw new IllegalStateException(a.ae(i, "Received unknown view type "));
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        mhVar.getClass();
        Object b = b(i);
        b.getClass();
        mhVar.A((dzp) b);
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void n(mh mhVar) {
        mhVar.getClass();
        if (!this.g.isDestroyed() && !this.g.isFinishing()) {
            mhVar.z();
        }
    }
}
