package defpackage;

import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoi extends et {
    public static final fa e = new eog();
    public final Consumer f;
    public kye g;
    private final boolean h;
    private final BidiFormatter i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eoi(java.util.function.Consumer r3, boolean r4, android.text.BidiFormatter r5, java.util.concurrent.Executor r6) {
        /*
            r2 = this;
            eq r0 = new eq
            fa r1 = defpackage.eoi.e
            r0.<init>(r1)
            r0.a = r6
            bfi r6 = r0.a()
            r2.<init>(r6)
            kye r6 = defpackage.kye.DEFAULT_NOT_SHARED
            r2.g = r6
            r2.f = r3
            r2.h = r4
            r2.i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoi.<init>(java.util.function.Consumer, boolean, android.text.BidiFormatter, java.util.concurrent.Executor):void");
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        return new eoh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.owner_row, viewGroup, false), this.h);
    }

    @Override // defpackage.lj
    public final /* synthetic */ void k(mh mhVar, int i) {
        eoh eohVar = (eoh) mhVar;
        boh bohVar = new boh();
        int i2 = eoh.u;
        bohVar.d(eohVar.t);
        eohVar.b.setOnClickListener(null);
        eon eonVar = (eon) b(i);
        kzq kzqVar = eonVar.a;
        eohVar.s.setText(this.i.unicodeWrap(kzqVar.b));
        if (kzqVar.d) {
            bohVar.l(R.id.owner_status, 0);
        } else if (eonVar.b) {
            bohVar.l(R.id.owner_progress_indicator, 0);
        } else if (this.g == kye.SHARED_BY_ME) {
            bohVar.l(R.id.action_image, 0);
            eohVar.b.setOnClickListener(new ecp(this, kzqVar, 6, null));
        }
        bohVar.b(eohVar.r);
    }
}
