package defpackage;

import com.google.android.apps.adm.accounts.AccountLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dul {
    public jiy b;
    public dyq d;
    public final apc e;
    private final hjy f;
    private final lqz g;
    public final Map a = new HashMap();
    public boolean c = false;

    public dul(elo eloVar, hjy hjyVar, lqz lqzVar, Executor executor) {
        eloVar.getClass();
        hjyVar.getClass();
        this.f = hjyVar;
        lqzVar.getClass();
        this.g = lqzVar;
        this.e = new apc(hjyVar, eloVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void e(dul dulVar) {
        dulVar.c = false;
    }

    public final void a() {
        this.c = true;
        ivc.N(this.f.b(), new dup(this, 1), (Executor) this.g.a());
    }

    public final boolean b(String str) {
        jiy jiyVar;
        if (str != null && (jiyVar = this.b) != null && jiyVar.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        jiy jiyVar = this.b;
        if (jiyVar != null && !jiyVar.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void d(String str, AccountLayout accountLayout) {
        if (b(str)) {
            this.e.s(str, accountLayout);
        }
    }
}
