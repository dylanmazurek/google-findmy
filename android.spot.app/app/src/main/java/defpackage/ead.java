package defpackage;

import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ead extends mh {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ead(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131558618(0x7f0d00da, float:1.8742557E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r4.getClass()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ead.<init>(android.view.ViewGroup):void");
    }

    @Override // defpackage.mh
    public final void A(dzp dzpVar) {
        if (dzpVar instanceof eac) {
            eac eacVar = (eac) dzpVar;
            ((TextView) this.b.findViewById(R.id.supervised_account_header)).setText(this.b.getContext().getResources().getQuantityString(R.plurals.adm_device_picker_supervised_account_header, eacVar.b, eacVar.a));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
