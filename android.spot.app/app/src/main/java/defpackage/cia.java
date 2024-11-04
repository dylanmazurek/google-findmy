package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cia extends cke {
    final /* synthetic */ lbr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cia(lbr lbrVar, int i) {
        super(i);
        this.a = lbrVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.cke
    public final void a(ckd ckdVar) {
        ddh ddhVar = new ddh(ckdVar, (byte[]) null);
        cji l = ddhVar.l("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (l.k()) {
                if (l.b(0) == 0) {
                    z = true;
                }
            }
            lbr lbrVar = this.a;
            l.h();
            ((cii) lbrVar.c).c(ddhVar);
            if (!z) {
                lzl g = ((cii) lbrVar.c).g(ddhVar);
                if (!g.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(g.b)));
                }
            }
            lbrVar.j(ddhVar);
            ((cii) lbrVar.c).a();
            for (bwe bweVar : lbrVar.e) {
            }
        } catch (Throwable th) {
            l.h();
            throw th;
        }
    }

    @Override // defpackage.cke
    public final void b(ckd ckdVar, int i, int i2) {
        d(ckdVar, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc A[LOOP:0: B:25:0x00d6->B:27:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ckd] */
    @Override // defpackage.cke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ckd r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cia.c(ckd):void");
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.cke
    public final void d(ckd ckdVar, int i, int i2) {
        ddh ddhVar = new ddh(ckdVar, (byte[]) null);
        lbr lbrVar = this.a;
        List c = bxc.c(((chj) lbrVar.b).n, i, i2);
        if (c != null) {
            ((cii) lbrVar.c).f(ddhVar);
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((cjj) it.next()).b(ddhVar);
            }
            lzl g = ((cii) lbrVar.c).g(ddhVar);
            if (g.a) {
                ((cii) lbrVar.c).b();
                lbrVar.j(ddhVar);
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(g.b)));
        }
        if (!bxc.b((chj) lbrVar.b, i, i2)) {
            ((cii) lbrVar.c).d(ddhVar);
            for (bwe bweVar : lbrVar.e) {
            }
            ((cii) lbrVar.c).c(ddhVar);
            return;
        }
        throw new IllegalStateException(a.aj(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }
}
