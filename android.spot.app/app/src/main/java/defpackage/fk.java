package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fk implements fh {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final ta d = new ta();

    public fk(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.fh
    public final void a(fi fiVar) {
        throw null;
    }

    @Override // defpackage.fh
    public final boolean b(fi fiVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.fh
    public final boolean c(fi fiVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.fh
    public final void d(fi fiVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(fi fiVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            fl flVar = (fl) this.c.get(i);
            if (flVar != null && flVar.b == fiVar) {
                return flVar;
            }
        }
        fl flVar2 = new fl(this.b, fiVar);
        this.c.add(flVar2);
        return flVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 == null) {
            gw gwVar = new gw(this.b, menu);
            this.d.put(menu, gwVar);
            return gwVar;
        }
        return menu2;
    }
}
