package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bqj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Set, java.lang.Object] */
    public static RemoteInput h(bqm bqmVar) {
        RemoteInput.Builder choices = new RemoteInput.Builder((String) bqmVar.b).setLabel(bqmVar.c).setChoices(null);
        boolean z = bqmVar.a;
        RemoteInput.Builder addExtras = choices.setAllowFreeFormInput(true).addExtras((Bundle) bqmVar.d);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = bqmVar.e.iterator();
            while (it.hasNext()) {
                bqk.a(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            bql.b(addExtras, 0);
        }
        return addExtras.build();
    }

    public static Bundle i(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    static void j(Object obj, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
    }

    public View a(MenuItem menuItem) {
        throw null;
    }

    public void b(SubMenu subMenu) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(njz njzVar) {
        throw null;
    }
}
