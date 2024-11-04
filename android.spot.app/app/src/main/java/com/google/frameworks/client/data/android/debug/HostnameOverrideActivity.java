package com.google.frameworks.client.data.android.debug;

import android.os.Bundle;
import com.google.android.apps.adm.R;
import defpackage.cs;
import defpackage.f;
import defpackage.kur;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HostnameOverrideActivity extends cs {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, defpackage.oc, defpackage.cd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hostname_override_activity);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("configs_to_display", getIntent().getParcelableArrayListExtra("to_display"));
            kur kurVar = new kur();
            kurVar.ak(bundle2);
            f fVar = new f(a());
            fVar.o(R.id.fragment_container, kurVar);
            fVar.b();
        }
    }
}
