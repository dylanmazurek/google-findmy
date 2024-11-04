package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kny implements kqz {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kny(Context context, String str, int i) {
        this.c = i;
        this.b = context;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [knv, java.lang.Object] */
    @Override // defpackage.kqz
    public final Object a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new ktd((Context) this.b, (String) this.a);
            }
            knh knhVar = (knh) this.a;
            koa koaVar = knhVar.c;
            String g = knhVar.g();
            return new kru((Context) this.b, g);
        }
        knu knuVar = (knu) this.b;
        return knuVar.f.a(new kop(knuVar, this.a));
    }

    public /* synthetic */ kny(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
