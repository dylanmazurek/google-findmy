package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.adm.R;
import defpackage.be;
import defpackage.cs;
import defpackage.f;
import defpackage.hzz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseMenuActivity extends cs {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, defpackage.oc, defpackage.cd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (g() != null) {
            g().g(true);
        }
        be a = a();
        if (!(a.e(R.id.license_menu_fragment_container) instanceof hzz)) {
            hzz hzzVar = new hzz();
            f fVar = new f(a);
            fVar.o(R.id.license_menu_fragment_container, hzzVar);
            fVar.b();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
