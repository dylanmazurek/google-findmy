package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmc extends blv {
    @Override // defpackage.blv
    public final void a(bmd bmdVar, bmd bmdVar2) {
        bmdVar.next = bmdVar2;
    }

    @Override // defpackage.blv
    public final void b(bmd bmdVar, Thread thread) {
        bmdVar.thread = thread;
    }

    @Override // defpackage.blv
    public final boolean c(bme bmeVar, blz blzVar, blz blzVar2) {
        synchronized (bmeVar) {
            if (bmeVar.listeners == blzVar) {
                bmeVar.listeners = blzVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.blv
    public final boolean d(bme bmeVar, Object obj, Object obj2) {
        synchronized (bmeVar) {
            if (bmeVar.value == obj) {
                bmeVar.value = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.blv
    public final boolean e(bme bmeVar, bmd bmdVar, bmd bmdVar2) {
        synchronized (bmeVar) {
            if (bmeVar.waiters == bmdVar) {
                bmeVar.waiters = bmdVar2;
                return true;
            }
            return false;
        }
    }
}
