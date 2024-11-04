package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpm {
    public String A;
    public int B;
    boolean C;
    public Notification D;

    @Deprecated
    public ArrayList E;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    ArrayList d;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    IconCompat h;
    CharSequence i;
    public int j;
    public int k;
    public boolean l;
    boolean m;
    bps n;
    CharSequence o;
    public CharSequence[] p;
    public String q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    Bundle v;
    public int w;
    public int x;
    public Notification y;
    public RemoteViews z;

    @Deprecated
    public bpm(Context context) {
        this(context, null);
    }

    public static CharSequence d(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final long a() {
        if (this.l) {
            return this.D.when;
        }
        return 0L;
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        RemoteViews j;
        bqb bqbVar = new bqb(this);
        bps bpsVar = bqbVar.c.n;
        if (bpsVar != null) {
            bpsVar.b(bqbVar);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            build = bqbVar.b.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            build = bqbVar.b.build();
            if (bqbVar.f != 0) {
                if (bpt.j(build) != null && (build.flags & 512) != 0 && bqbVar.f == 2) {
                    bqb.a(build);
                }
                if (bpt.j(build) != null && (build.flags & 512) == 0 && bqbVar.f == 1) {
                    bqb.a(build);
                }
            }
        } else {
            bqbVar.b.setExtras(bqbVar.e);
            build = bqbVar.b.build();
            RemoteViews remoteViews = bqbVar.d;
            if (remoteViews != null) {
                build.bigContentView = remoteViews;
            }
            if (bqbVar.f != 0) {
                if (bpt.j(build) != null && (build.flags & 512) != 0 && bqbVar.f == 2) {
                    bqb.a(build);
                }
                if (bpt.j(build) != null && (build.flags & 512) == 0 && bqbVar.f == 1) {
                    bqb.a(build);
                }
            }
        }
        if (bpsVar != null && (j = bpsVar.j()) != null) {
            build.bigContentView = j;
        }
        if (bpsVar != null) {
            bqbVar.c.n.e();
        }
        if (bpsVar != null && (bundle = build.extras) != null) {
            bpsVar.i(bundle);
        }
        return build;
    }

    public final Bundle c() {
        if (this.v == null) {
            this.v = new Bundle();
        }
        return this.v;
    }

    public final void e(int i, boolean z) {
        if (z) {
            Notification notification = this.D;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.D;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void f(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat j;
        ArrayList arrayList = this.b;
        if (i == 0) {
            j = null;
        } else {
            j = IconCompat.j(null, "", i);
        }
        arrayList.add(new bpg(j, charSequence, pendingIntent, new Bundle(), null));
    }

    public final void g(boolean z) {
        e(16, z);
    }

    public final void h(CharSequence charSequence) {
        this.f = d(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.e = d(charSequence);
    }

    public final void j(int i) {
        this.D.defaults = i;
        if ((i & 4) != 0) {
            this.D.flags |= 1;
        }
    }

    public final void k(PendingIntent pendingIntent) {
        this.D.deleteIntent = pendingIntent;
    }

    public final void l(Bitmap bitmap) {
        IconCompat h;
        if (bitmap == null) {
            h = null;
        } else {
            Context context = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            h = IconCompat.h(bitmap);
        }
        this.h = h;
    }

    public final void m(int i) {
        this.D.icon = i;
    }

    public final void n(bps bpsVar) {
        if (this.n != bpsVar) {
            this.n = bpsVar;
            if (bpsVar != null && bpsVar.a != this) {
                bpsVar.a = this;
                bpm bpmVar = bpsVar.a;
                if (bpmVar != null) {
                    bpmVar.n(bpsVar);
                }
            }
        }
    }

    public final void o(CharSequence charSequence) {
        this.o = d(charSequence);
    }

    public final void p(CharSequence charSequence) {
        this.D.tickerText = d(charSequence);
    }

    public final void q(long[] jArr) {
        this.D.vibrate = jArr;
    }

    public final void r(long j) {
        this.D.when = j;
    }

    public bpm(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.l = true;
        this.t = false;
        this.w = 0;
        this.x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.D = notification;
        this.a = context;
        this.A = str;
        notification.when = System.currentTimeMillis();
        this.D.audioStreamType = -1;
        this.k = 0;
        this.E = new ArrayList();
        this.C = true;
    }
}
