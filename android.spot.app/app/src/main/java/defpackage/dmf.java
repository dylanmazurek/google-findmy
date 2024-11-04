package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmf extends dtm {
    public dkt a;

    public dmf(long j) {
        super(j);
    }

    @Override // defpackage.dtm
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        dlf dlfVar = (dlf) obj;
        if (dlfVar == null) {
            return 1;
        }
        return dlfVar.a();
    }

    public final /* bridge */ /* synthetic */ dlf b(dir dirVar) {
        return (dlf) super.h(dirVar);
    }

    @Override // defpackage.dtm
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        dlf dlfVar = (dlf) obj2;
        dkt dktVar = this.a;
        if (dktVar != null && dlfVar != null) {
            dktVar.e.a(dlfVar, true);
        }
    }

    public final /* bridge */ /* synthetic */ void d(dir dirVar, dlf dlfVar) {
    }
}
