package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyl extends iyo {
    final /* synthetic */ iym a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyl(iym iymVar, bym bymVar) {
        super(iymVar, bymVar);
        this.a = iymVar;
        new jck("OnRequestInstallCallback");
    }

    @Override // defpackage.iyo
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (iym.a(bundle) != 0) {
            this.c.t(new iyp(iym.a(bundle)));
            return;
        }
        bym bymVar = this.c;
        iym iymVar = this.a;
        bundle.getInt("version.code", -1);
        int i = bundle.getInt("update.availability");
        bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        jck.l(new File(((Context) iymVar.e.a).getFilesDir(), "assetpacks"));
        HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", iym.b(bundle.getIntegerArrayList(iqg.n("blocking.destructive.intent"))));
        hashMap.put("nonblocking.destructive.intent", iym.b(bundle.getIntegerArrayList(iqg.n("nonblocking.destructive.intent"))));
        hashMap.put("blocking.intent", iym.b(bundle.getIntegerArrayList(iqg.n("blocking.intent"))));
        hashMap.put("nonblocking.intent", iym.b(bundle.getIntegerArrayList(iqg.n("nonblocking.intent"))));
        bymVar.u(new nbw(i, (byte[]) null));
    }
}
