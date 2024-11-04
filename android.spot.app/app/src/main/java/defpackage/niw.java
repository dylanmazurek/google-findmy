package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niw extends ngv {
    final /* synthetic */ nja d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niw(String str, nja njaVar, int i) {
        super(str);
        this.d = njaVar;
        this.e = i;
    }

    @Override // defpackage.ngv
    public final long a() {
        synchronized (this.d) {
            this.d.w.remove(Integer.valueOf(this.e));
        }
        return -1L;
    }
}
