package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glh implements moh {
    final /* synthetic */ long a;

    public glh(long j) {
        this.a = j;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        cji l = ((ddh) obj).l("DELETE FROM chime_thread_states WHERE modified_timestamp < ?");
        try {
            l.e(1, this.a);
            l.k();
            l.h();
            return null;
        } catch (Throwable th) {
            l.h();
            throw th;
        }
    }
}
