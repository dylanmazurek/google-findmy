package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kry implements fxm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kry(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.fxm
    public final void a(fxs fxsVar) {
        if (this.c != 0) {
            Object obj = this.b;
            Object obj2 = this.a;
            synchronized (((izc) obj2).e) {
                ((izc) obj2).d.remove(obj);
            }
            return;
        }
        ((krz) this.a).d((Intent) this.b);
    }
}
