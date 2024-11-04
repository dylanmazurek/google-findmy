package defpackage;

import android.app.Activity;
import com.google.android.apps.adm.R;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eag extends mh {
    public final Activity r;
    public final ezl s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eag(android.view.ViewGroup r4, defpackage.ezl r5, android.app.Activity r6) {
        /*
            r3 = this;
            r5.getClass()
            r6.getClass()
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131558620(0x7f0d00dc, float:1.874256E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r4.getClass()
            r3.<init>(r4)
            r3.s = r5
            r3.r = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eag.<init>(android.view.ViewGroup, ezl, android.app.Activity):void");
    }

    @Override // defpackage.mh
    public final void A(dzp dzpVar) {
        if (dzpVar instanceof eaf) {
            ezk ezkVar = ((eaf) dzpVar).a;
            if (ezkVar == null) {
                return;
            }
            Chip chip = (Chip) this.b.findViewById(R.id.switch_to_personal_profile);
            chip.setText(ezkVar.a);
            ipu ipuVar = chip.e;
            if (ipuVar != null) {
                ipuVar.k(ezkVar.b);
            }
            chip.setVisibility(0);
            chip.setOnClickListener(new he(this, 9, null));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
