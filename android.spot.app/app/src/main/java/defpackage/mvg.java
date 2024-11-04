package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvg extends mst {
    public static final /* synthetic */ int a = 0;

    static {
        new mvg();
    }

    private mvg() {
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        mvk mvkVar = (mvk) mnbVar.get(mvk.b);
        if (mvkVar != null) {
            mvkVar.a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // defpackage.mst
    public final boolean cp(mnb mnbVar) {
        return false;
    }

    @Override // defpackage.mst
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
