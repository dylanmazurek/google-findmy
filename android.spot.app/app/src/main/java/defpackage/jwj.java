package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jwj extends jwc {
    @Override // defpackage.jwc
    public final jwg a(jwq jwqVar, jwg jwgVar) {
        jwg jwgVar2;
        synchronized (jwqVar) {
            jwgVar2 = jwqVar.listeners;
            if (jwgVar2 != jwgVar) {
                jwqVar.listeners = jwgVar;
            }
        }
        return jwgVar2;
    }

    @Override // defpackage.jwc
    public final jwp b(jwq jwqVar, jwp jwpVar) {
        jwp jwpVar2;
        synchronized (jwqVar) {
            jwpVar2 = jwqVar.waiters;
            if (jwpVar2 != jwpVar) {
                jwqVar.waiters = jwpVar;
            }
        }
        return jwpVar2;
    }

    @Override // defpackage.jwc
    public final void c(jwp jwpVar, jwp jwpVar2) {
        jwpVar.next = jwpVar2;
    }

    @Override // defpackage.jwc
    public final void d(jwp jwpVar, Thread thread) {
        jwpVar.thread = thread;
    }

    @Override // defpackage.jwc
    public final boolean e(jwq jwqVar, jwg jwgVar, jwg jwgVar2) {
        synchronized (jwqVar) {
            if (jwqVar.listeners == jwgVar) {
                jwqVar.listeners = jwgVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.jwc
    public final boolean f(jwq jwqVar, Object obj, Object obj2) {
        synchronized (jwqVar) {
            if (jwqVar.value == obj) {
                jwqVar.value = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.jwc
    public final boolean g(jwq jwqVar, jwp jwpVar, jwp jwpVar2) {
        synchronized (jwqVar) {
            if (jwqVar.waiters == jwpVar) {
                jwqVar.waiters = jwpVar2;
                return true;
            }
            return false;
        }
    }
}
