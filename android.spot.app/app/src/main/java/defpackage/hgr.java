package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgr extends LinearLayout {
    public final RecyclerView a;

    public hgr(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.incognito_content, this);
        setOrientation(1);
        this.a = (RecyclerView) findViewById(R.id.common_actions);
    }
}
