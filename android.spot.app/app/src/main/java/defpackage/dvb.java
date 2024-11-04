package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvb implements bvd {
    private final Context a;
    private final nca b;

    public dvb(Context context, nca ncaVar) {
        this.a = context;
        this.b = ncaVar;
    }

    @Override // defpackage.bvd
    public final void a(Menu menu, MenuInflater menuInflater) {
        if (nca.l(this.a)) {
            menuInflater.inflate(R.menu.main, menu);
        } else {
            menuInflater.inflate(R.menu.main_nofeedback, menu);
        }
    }

    @Override // defpackage.bvd
    public final boolean d(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_help_feedback) {
            this.b.k();
            return true;
        }
        return false;
    }

    @Override // defpackage.bvd
    public final /* synthetic */ void b(Menu menu) {
    }

    @Override // defpackage.bvd
    public final /* synthetic */ void c(Menu menu) {
    }
}
