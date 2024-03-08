import { SidenavItem } from "app/base/sidenav/sidenav.model";

export const SIDENAV_ITEMS: SidenavItem[] = [
  {
    id: 'products',
    labels: {
      en: "Products",
      fr: "Produits"
    },
    link: '/products'

  },
  {
    id: 'admin',
    labels: {
      en: "Admin",
      fr: "Admin"
    },
    link: '/admin',
    children: [
      {
        id: 'products',
        labels: {
          en: "Products",
          fr: "Produits"
        },
        link: 'products',
        enrichedUrl: () => 'admin/products'
      }
    ]
  }

];






