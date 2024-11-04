package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgs extends LinearLayout {
    public hgs(Context context, byte[] bArr) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.choose_an_account_content, this);
        setOrientation(1);
    }

    public final hcy a(cfk cfkVar, hcc hccVar, hgw hgwVar, int i) {
        Context context = getContext();
        if (cfkVar == null) {
            int i2 = jis.d;
            cfkVar = new cfn(jmi.a);
        }
        cfk cfkVar2 = cfkVar;
        hcd hcdVar = hccVar.b;
        hjp hjpVar = hccVar.l;
        hej hejVar = hccVar.d.j;
        return new hcy(context, hcdVar, cfkVar2, hgwVar, hjpVar, i);
    }

    public final hcy b(cfk cfkVar, hcc hccVar, hgw hgwVar, int i) {
        Context context = getContext();
        if (cfkVar == null) {
            int i2 = jis.d;
            cfkVar = new cfn(jmi.a);
        }
        cfk cfkVar2 = cfkVar;
        hcd hcdVar = hccVar.b;
        hjp hjpVar = hccVar.l;
        hej hejVar = hccVar.d.j;
        return new hcy(context, hcdVar, cfkVar2, hgwVar, hjpVar, i);
    }

    public hgs(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.signed_out_content, this);
        setOrientation(1);
    }
}
