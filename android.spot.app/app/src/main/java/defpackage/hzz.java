package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzz extends ag {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.ag
    public final void ab() {
        super.ab();
        cgz a = cgz.a(E());
        if (!a.b.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (cgz.b(2)) {
                    Objects.toString(a);
                }
                cha b = a.b.b();
                if (b != null) {
                    b.o();
                    tb tbVar = a.b.b;
                    int a2 = td.a(tbVar.b, tbVar.d, 54321);
                    if (a2 >= 0) {
                        Object[] objArr = tbVar.c;
                        Object obj = objArr[a2];
                        Object obj2 = tc.a;
                        if (obj != obj2) {
                            objArr[a2] = obj2;
                            tbVar.a = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        aj E = E();
        this.a = new ArrayAdapter(E, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        cgz a = cgz.a(E);
        if (!a.b.c) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                cha b = a.b.b();
                if (cgz.b(2)) {
                    Objects.toString(a);
                }
                if (b == null) {
                    try {
                        a.b.c = true;
                        chf chfVar = new chf(E());
                        if (chfVar.getClass().isMemberClass() && !Modifier.isStatic(chfVar.getClass().getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + chfVar);
                        }
                        cha chaVar = new cha(chfVar);
                        if (cgz.b(3)) {
                            chaVar.toString();
                        }
                        a.b.b.g(54321, chaVar);
                        a.b.a();
                        chaVar.p(a.a, this);
                    } catch (Throwable th) {
                        a.b.a();
                        throw th;
                    }
                } else {
                    if (cgz.b(3)) {
                        Objects.toString(b);
                    }
                    b.p(a.a, this);
                }
                ListView listView = (ListView) view.findViewById(R.id.license_list);
                listView.setAdapter((ListAdapter) this.a);
                listView.setOnItemClickListener(new hzy(this, 0));
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // defpackage.ag
    public final void ct() {
        super.ct();
        this.b = null;
    }

    @Override // defpackage.ag
    public final void f(Context context) {
        super.f(context);
        aj E = E();
        if (E instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) E;
        }
    }
}
