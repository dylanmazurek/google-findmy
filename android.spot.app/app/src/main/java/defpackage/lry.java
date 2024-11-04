package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lry implements lsh {
    private final /* synthetic */ int a;
    private final Object b;

    public lry(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        if (this.a != 0) {
            return b();
        }
        return b();
    }

    public final Context b() {
        Object obj;
        if (this.a != 0) {
            obj = ((jck) this.b).a;
        } else {
            obj = ((ktf) this.b).b;
        }
        return (Context) obj;
    }
}
