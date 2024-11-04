package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lji extends lhy {
    private final ljn a;

    public lji(ljn ljnVar) {
        this.a = ljnVar;
    }

    @Override // defpackage.lhy
    public final /* bridge */ /* synthetic */ lkq d(byte[] bArr, int i, int i2, lja ljaVar) {
        return ljn.m(this.a, bArr, i, i2, ljaVar);
    }

    @Override // defpackage.lkx
    public final /* bridge */ /* synthetic */ Object k(liq liqVar, lja ljaVar) {
        Map map = ljn.z;
        ljn l = this.a.l();
        try {
            llg b = lkz.a.b(l);
            b.l(l, lir.p(liqVar), ljaVar);
            b.g(l);
            return l;
        } catch (IOException e) {
            if (e.getCause() instanceof ljy) {
                throw ((ljy) e.getCause());
            }
            throw new ljy(e);
        } catch (llo e2) {
            throw e2.a();
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ljy) {
                throw ((ljy) e3.getCause());
            }
            throw e3;
        } catch (ljy e4) {
            if (e4.a) {
                throw new ljy(e4);
            }
            throw e4;
        }
    }
}
