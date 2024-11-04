package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrv extends ContextWrapper {
    public ag a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final cfa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrv(Context context, ag agVar) {
        super(context);
        iqg.E(context);
        nw nwVar = new nw(this, 4);
        this.d = nwVar;
        this.b = null;
        this.a = agVar;
        agVar.ad.a(nwVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext(this);
        }
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lrv(android.view.LayoutInflater r3, defpackage.ag r4) {
        /*
            r2 = this;
            defpackage.iqg.E(r3)
            android.content.Context r0 = r3.getContext()
            defpackage.iqg.E(r0)
            r2.<init>(r0)
            nw r0 = new nw
            r1 = 4
            r0.<init>(r2, r1)
            r2.d = r0
            r2.b = r3
            r2.a = r4
            cex r3 = r4.ad
            r3.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrv.<init>(android.view.LayoutInflater, ag):void");
    }
}
