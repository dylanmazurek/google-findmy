package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.frameworks.client.data.android.debug.ServiceOverrideView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuw extends lj {
    public final ag a;
    public jis e;

    public kuw(ag agVar) {
        int i = jis.d;
        this.e = jmi.a;
        this.a = agVar;
    }

    @Override // defpackage.lj
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        return new kux((ServiceOverrideView) LayoutInflater.from(this.a.x()).inflate(R.layout.service_override_view, viewGroup, false));
    }

    @Override // defpackage.lj
    public final /* synthetic */ void k(mh mhVar, int i) {
        String str;
        kut kutVar = (kut) this.e.get(i);
        View view = ((kux) mhVar).r;
        kus kusVar = kutVar.a;
        ServiceOverrideView serviceOverrideView = (ServiceOverrideView) view;
        ((TextView) serviceOverrideView.findViewById(R.id.service_name)).setText(kusVar.b);
        ((TextView) serviceOverrideView.findViewById(R.id.system_property_name)).setText(kusVar.b());
        TextView textView = (TextView) serviceOverrideView.findViewById(R.id.using_system_prop);
        if (true != kutVar.c) {
            str = "No";
        } else {
            str = "Yes";
        }
        textView.setText(str);
        String str2 = kutVar.b;
        TextView textView2 = (TextView) serviceOverrideView.findViewById(R.id.endpoint_value);
        if (str2 == null) {
            str2 = "default";
        }
        textView2.setText(str2);
        serviceOverrideView.setOnClickListener(new hgq(this, kutVar, 9, null));
    }
}
