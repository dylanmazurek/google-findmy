package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fku extends fkn implements fhm {
    private static volatile Executor t;
    public final Set s;
    private final Account u;

    /* JADX INFO: Access modifiers changed from: protected */
    public fku(Context context, Looper looper, int i, fkp fkpVar, fiv fivVar, fjr fjrVar) {
        super(context, looper, fkw.a(context), fgp.a, i, new njz(fivVar, null), new njz(fjrVar, null), fkpVar.e);
        this.u = fkpVar.a;
        Set set = fkpVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.s = set;
    }

    @Override // defpackage.fkn
    public final Feature[] D() {
        return new Feature[0];
    }

    @Override // defpackage.fkn, defpackage.fhm
    public int a() {
        throw null;
    }

    @Override // defpackage.fhm
    public final Set k() {
        if (p()) {
            return this.s;
        }
        return Collections.emptySet();
    }

    @Override // defpackage.fkn
    public final Account t() {
        return this.u;
    }

    @Override // defpackage.fkn
    protected final void F() {
    }
}
