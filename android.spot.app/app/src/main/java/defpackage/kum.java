package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.frameworks.client.data.android.debug.HostnameOverrideView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kum extends lj {
    public final ag a;
    public jis e;

    public kum(ag agVar) {
        int i = jis.d;
        this.e = jmi.a;
        this.a = agVar;
    }

    @Override // defpackage.lj
    public final int a() {
        return ((jmi) this.e).c;
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        return new kux((HostnameOverrideView) LayoutInflater.from(this.a.x()).inflate(R.layout.hostname_override_view, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.widget.TextView] */
    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        kpb kpbVar = (kpb) this.e.get(i);
        Object obj = kpbVar.b;
        HostnameOverrideView hostnameOverrideView = (HostnameOverrideView) ((kux) mhVar).r;
        ((TextView) hostnameOverrideView.findViewById(R.id.prod_host_name)).setText((CharSequence) hzc.W(kpbVar.b));
        Object obj2 = kpbVar.c;
        ?? r2 = (TextView) hostnameOverrideView.findViewById(R.id.endpoint_value);
        ?? r1 = obj2;
        if (obj2 == null) {
            r1 = "Using various endpoints";
        }
        r2.setText(r1);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) kpbVar.a).iterator();
        while (it.hasNext()) {
            sb.append(((kus) it.next()).b);
            if (it.hasNext()) {
                sb.append("\n");
            }
        }
        ((TextView) hostnameOverrideView.findViewById(R.id.services_list)).setText(sb.toString());
        hostnameOverrideView.setOnClickListener(new ewp(this, kpbVar, obj, 2));
    }
}
