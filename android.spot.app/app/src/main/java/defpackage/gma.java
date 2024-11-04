package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gma implements gls {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final gnv c;

    public gma(Context context, gnv gnvVar) {
        this.b = context;
        this.c = gnvVar;
    }

    @Override // defpackage.gls
    public final String a(ggk ggkVar) {
        Set emptySet;
        List notificationChannels;
        String id;
        if (frx.aH()) {
            if (frx.aH()) {
                emptySet = new rz();
                notificationChannels = ((NotificationManager) this.b.getSystemService("notification")).getNotificationChannels();
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    id = p$$ExternalSyntheticApiModelOutline0.m(it.next()).getId();
                    emptySet.add(id);
                }
            } else {
                emptySet = Collections.emptySet();
            }
            lft lftVar = ggkVar.d.n;
            if (lftVar == null) {
                lftVar = lft.c;
            }
            String str = lftVar.b;
            if (TextUtils.isEmpty(str) || !emptySet.contains(str)) {
                String str2 = this.c.c.i;
                if (!TextUtils.isEmpty(str2) && emptySet.contains(str2)) {
                    return str2;
                }
                ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getChannelIdAndroidOOrLater", 182, "NotificationChannelHelperImpl.java")).z("Did not find the intended channel '%s' or the default channel '%s' in '%s'", str, str2, emptySet);
            } else {
                return str;
            }
        }
        return null;
    }

    @Override // defpackage.gls
    public final List b() {
        List notificationChannelGroups;
        String id;
        boolean isBlocked;
        Object obj;
        if (frx.aI()) {
            NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
            ArrayList arrayList = new ArrayList();
            try {
                notificationChannelGroups = notificationManager.getNotificationChannelGroups();
                Iterator it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup m206m = p$$ExternalSyntheticApiModelOutline0.m206m(it.next());
                    ifp ifpVar = new ifp((char[]) null);
                    ifpVar.d(false);
                    id = m206m.getId();
                    if (id != null) {
                        ifpVar.c = id;
                        isBlocked = m206m.isBlocked();
                        ifpVar.d(isBlocked);
                        if (ifpVar.b == 1 && (obj = ifpVar.c) != null) {
                            arrayList.add(new glr((String) obj, ifpVar.a));
                        }
                        StringBuilder sb = new StringBuilder();
                        if (ifpVar.c == null) {
                            sb.append(" id");
                        }
                        if (ifpVar.b == 0) {
                            sb.append(" blocked");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    throw new NullPointerException("Null id");
                }
            } catch (RuntimeException e) {
                ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getNotificationChannelGroupsAndroidPOrLater", (char) 138, "NotificationChannelHelperImpl.java")).r("Failed getting notification channel groups");
            }
            return arrayList;
        }
        return Arrays.asList(new glr[0]);
    }

    @Override // defpackage.gls
    public final List c() {
        List notificationChannels;
        String id;
        int importance;
        int i;
        String group;
        Object obj;
        int i2;
        String group2;
        if (frx.aH()) {
            NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
            ArrayList arrayList = new ArrayList();
            try {
                notificationChannels = notificationManager.getNotificationChannels();
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    NotificationChannel m = p$$ExternalSyntheticApiModelOutline0.m(it.next());
                    jko jkoVar = new jko();
                    jkoVar.a("");
                    id = m.getId();
                    if (id != null) {
                        jkoVar.c = id;
                        importance = m.getImportance();
                        if (importance != 0) {
                            i = 5;
                            if (importance != 1) {
                                if (importance != 2) {
                                    if (importance != 3) {
                                        if (importance != 4) {
                                            if (importance != 5) {
                                                i = 1;
                                            } else {
                                                i = 6;
                                            }
                                        } else {
                                            i = 3;
                                        }
                                    } else {
                                        i = 2;
                                    }
                                } else {
                                    i = 4;
                                }
                            }
                        } else {
                            i = 7;
                        }
                        jkoVar.a = i;
                        group = m.getGroup();
                        if (!TextUtils.isEmpty(group)) {
                            group2 = m.getGroup();
                            jkoVar.a(group2);
                        }
                        Object obj2 = jkoVar.c;
                        if (obj2 != null && (obj = jkoVar.b) != null && (i2 = jkoVar.a) != 0) {
                            arrayList.add(new glq((String) obj2, (String) obj, i2));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            if (jkoVar.c == null) {
                                sb.append(" id");
                            }
                            if (jkoVar.b == null) {
                                sb.append(" group");
                            }
                            if (jkoVar.a == 0) {
                                sb.append(" importance");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                    } else {
                        throw new NullPointerException("Null id");
                    }
                }
            } catch (Exception e) {
                ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getNotificationChannelsAndroidOOrLater", '\\', "NotificationChannelHelperImpl.java")).r("Failed to get notification channels from Android.");
            }
            return arrayList;
        }
        return Arrays.asList(new glq[0]);
    }

    @Override // defpackage.gls
    public final void d(bpm bpmVar, ggk ggkVar) {
        String a2 = a(ggkVar);
        if (!TextUtils.isEmpty(a2)) {
            ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "setChannelId", 45, "NotificationChannelHelperImpl.java")).u("Setting channel Id: '%s'", a2);
            bpmVar.A = a2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:            r4 = ((android.app.NotificationManager) r3.b.getSystemService("notification")).getNotificationChannel(r4);     */
    @Override // defpackage.gls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.String r4) {
        /*
            r3 = this;
            android.content.Context r0 = r3.b
            boolean r0 = defpackage.frx.aK(r0)
            r1 = 1
            if (r0 == 0) goto L29
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L10
            goto L27
        L10:
            android.content.Context r0 = r3.b
            java.lang.String r2 = "notification"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.NotificationChannel r4 = defpackage.cs$$ExternalSyntheticApiModelOutline0.m(r0, r4)
            if (r4 == 0) goto L27
            int r4 = defpackage.p$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r4 <= 0) goto L27
            return r1
        L27:
            r4 = 0
            return r4
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gma.e(java.lang.String):boolean");
    }
}
